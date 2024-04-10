package com.example.tuan_be_sprint2.controller;

import com.example.tuan_be_sprint2.config.ConfigVNP;
import com.example.tuan_be_sprint2.dto.DetailBuyBookDTO;
import com.example.tuan_be_sprint2.model.BookProduct;
import com.example.tuan_be_sprint2.model.DetailBuyBook;
import com.example.tuan_be_sprint2.service.IBookService;
import com.example.tuan_be_sprint2.service.IDetailBuyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    IDetailBuyBookService iDetailBuyBookService;
    @Autowired
    IBookService bookService;




    @GetMapping("/createPay")
    private ResponseEntity<String> payment(@RequestParam Long price,
                                           @RequestParam Long idAccount) throws UnsupportedEncodingException {
        long amount = price * 100;
        String vnp_Version = "2.1.0";
        String vnp_Command = "pay";
        String orderType = "other";
        String bankCode = "NCB";
        String vnp_TxnRef = ConfigVNP.getRandomNumber(8);
        String vnp_IpAddr = "127.0.0.1";
        String vnp_TmnCode = ConfigVNP.vnp_TmnCode;
        String vnp_ReturnUrl = "http://localhost:3000/payOk/" + idAccount + "/";
        Map<String, String> vnp_Params = new HashMap<>();
        vnp_Params.put("vnp_Version", vnp_Version);
        vnp_Params.put("vnp_Command", vnp_Command);
        vnp_Params.put("vnp_TmnCode", vnp_TmnCode);
        vnp_Params.put("vnp_Amount", String.valueOf(amount));
        vnp_Params.put("vnp_CurrCode", "VND");
        vnp_Params.put("vnp_BankCode", bankCode);
        vnp_Params.put("vnp_TxnRef", vnp_TxnRef);
        vnp_Params.put("vnp_OrderInfo", "Thanh toan don hang:" + vnp_TxnRef);
        vnp_Params.put("vnp_OrderType", orderType);

        vnp_Params.put("vnp_Locale", "vn");
        vnp_Params.put("vnp_ReturnUrl", vnp_ReturnUrl);
        vnp_Params.put("vnp_IpAddr", vnp_IpAddr);

        Calendar cld = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+7"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String vnp_CreateDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_CreateDate", vnp_CreateDate);

        cld.add(Calendar.MINUTE, 15);
        String vnp_ExpireDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_ExpireDate", vnp_ExpireDate);

        List fieldNames = new ArrayList(vnp_Params.keySet());
        Collections.sort(fieldNames);
        StringBuilder hashData = new StringBuilder();
        StringBuilder query = new StringBuilder();
        Iterator itr = fieldNames.iterator();
        while (itr.hasNext()) {
            String fieldName = (String) itr.next();
            String fieldValue = (String) vnp_Params.get(fieldName);
            if ((fieldValue != null) && (fieldValue.length() > 0)) {
                //Build hash data
                hashData.append(fieldName);
                hashData.append('=');
                hashData.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII.toString()));
                //Build query
                query.append(URLEncoder.encode(fieldName, StandardCharsets.US_ASCII.toString()));
                query.append('=');
                query.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII.toString()));
                if (itr.hasNext()) {
                    query.append('&');
                    hashData.append('&');
                }
            }
        }
        String queryUrl = query.toString();
        String vnp_SecureHash = ConfigVNP.hmacSHA512(ConfigVNP.secretKey, hashData.toString());
        queryUrl += "&vnp_SecureHash=" + vnp_SecureHash;
        String paymentUrl = ConfigVNP.vnp_PayUrl + "?" + queryUrl;
//        return ResponseEntity.status(HttpStatus.OK).body(paymentResDTO);
        return new ResponseEntity<>(paymentUrl, HttpStatus.OK);
    }

    @GetMapping("/payment_infor/{idAccount}")
    public void handlePaymentInfo(
            @PathVariable int idAccount,
            @RequestParam(value = "vnp_Amount", required = false) String amount,
            @RequestParam(value = "vnp_BankCode", required = false) String bankCode,
            @RequestParam(value = "vnp_BankTranNo", required = false) String bankTranNo,
            @RequestParam(value = "vnp_CardType", required = false) String cardType,
            @RequestParam(value = "vnp_OrderInfo", required = false) String orderInfo,
            @RequestParam(value = "vnp_PayDate", required = false) String payDate,
            @RequestParam(value = "vnp_ResponseCode", required = false) String statusCode,
            @RequestParam(value = "vnp_TmnCode", required = false) String tmnCode,
            @RequestParam(value = "vnp_TransactionNo", required = false) String transactionNo,
            @RequestParam(value = "vnp_TransactionStatus", required = false) String transactionStatus,
            @RequestParam(value = "vnp_TxnRef", required = false) String txnRef,
            @RequestParam(value = "vnp_SecureHash", required = false) String secureHash) {

        // Xử lý thông tin thanh toán ở đây
        System.out.println("ID Account: " + idAccount);
        System.out.println("Amount: " + amount);
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Bank Transaction No: " + bankTranNo);
        System.out.println("Card Type: " + cardType);
        System.out.println("Order Info: " + orderInfo);
        System.out.println("Pay Date: " + payDate);
        System.out.println("Response Code: " + statusCode);
        System.out.println("Tmn Code: " + tmnCode);
        System.out.println("Transaction No: " + transactionNo);
        System.out.println("Transaction Status: " + transactionStatus);
        System.out.println("Transaction Ref: " + txnRef);
        System.out.println("Secure Hash: " + secureHash);
        List<DetailBuyBookDTO> detailBuyBookDTOS = iDetailBuyBookService.displayListItemsInCart(idAccount);
        List<DetailBuyBook> detailBuyBookList = iDetailBuyBookService.DetailBuyBookDisplay(idAccount);
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.valueOf(now.toLocalDate());
        for (int i = 0; i < detailBuyBookDTOS.size(); i++) {
            BookProduct bookProduct = bookService.findBookByName(detailBuyBookDTOS.get(i).getNameBook());
            bookProduct.setAmountBook(bookProduct.getAmountBook() - detailBuyBookDTOS.get(i).getQuantity());
            bookProduct.setLikeBook(bookProduct.getLikeBook() + 1);
            bookService.save(bookProduct);
            detailBuyBookList.get(i).setStatusPayment(true);
            detailBuyBookList.get(i).setBuyDate(date);
            detailBuyBookList.get(i).setPriceOfProduct(detailBuyBookDTOS.get(i).getQuantityBook() * detailBuyBookDTOS.get(i).getPrice());
            detailBuyBookList.get(i).setModeOfPayment(1);
            iDetailBuyBookService.saveToCart(detailBuyBookList.get(i));
        }
    }
    @GetMapping("/paymentAfter/{idAccount}")
    public ResponseEntity<?> paymentAfterReceive(@PathVariable int idAccount){
           List<DetailBuyBookDTO> detailBuyBookDTOList = iDetailBuyBookService.displayListItemsInCart(idAccount);
        List<DetailBuyBook> detailBuyBookList = iDetailBuyBookService.DetailBuyBookDisplay(idAccount);
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.valueOf(now.toLocalDate());
        for (int i = 0; i < detailBuyBookDTOList.size(); i++) {
            BookProduct bookProduct = bookService.findBookByName(detailBuyBookDTOList.get(i).getNameBook());
            bookProduct.setAmountBook(bookProduct.getAmountBook() - detailBuyBookDTOList.get(i).getQuantity());
            bookProduct.setLikeBook(bookProduct.getLikeBook() + 1);
            bookService.save(bookProduct);
            detailBuyBookList.get(i).setStatusPayment(true);
            detailBuyBookList.get(i).setBuyDate(date);
            detailBuyBookList.get(i).setPriceOfProduct(detailBuyBookDTOList.get(i).getQuantityBook() * detailBuyBookDTOList.get(i).getPrice());
            detailBuyBookList.get(i).setModeOfPayment(2);
            iDetailBuyBookService.saveToCart(detailBuyBookList.get(i));
        }
    return new ResponseEntity<>(HttpStatus.OK);


    }
}