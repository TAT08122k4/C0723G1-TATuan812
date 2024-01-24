// 1. Tạo một mảng mới chứa các số lớn hơn 5 từ mảng ban đầu.
console.log("Kết Quả Bài 1:")
let arr = [1,7,2,5,8,3,9]
let arr2 = arr.filter(v => v > 5)
console.log(arr2);
// 2.Sử dụng arrow function và reduce để tính tổng các phần tử trong mảng.
console.log("Kết Quả Bài 2:")
let arr3 = arr.reduce((a,b) => a + b)
console.log(arr3);
// 3. Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy".
console.log("Kết Quả Bài 3:")
let v = 11;
let arr4 = arr.filter( x => x === v)
if(arr4.length === 0){
    console.log("Không tìm thấy");
}else{
    console.log(arr4); 
}
// 4. Kiểm tra 1 mảng tất cả các phần tử trong mảng đó có lớn hơn 0 hay không?.
console.log("Kết Quả Bài 4:")
let arr5 = arr.every(x => x > 0)
if(arr5 === true){
    console.log("Tất Cả Các Phần Tử Đều Lớn Hơn 0")
}else{
    console.log("Tất Cả Các Phần Tử Đều Không Lớn Hơn 0")
}
// 5. Tìm phần tử đầu tiên trong mảng lớn hơn 3.
console.log("Kết Quả Bài 5:")
let arr6 = arr.filter(v => v > 3)
console.log(arr6[0]);
// 6. Sử dụng destructuring với rest parameter để trích xuất phần tử đầu tiên vào biến "first" và các phần tử còn lại vào một mảng mới "rest".
console.log("Kết Quả Bài 6:")
let [first,second, ...rest] = arr;
console.log(first);
console.log(second);
console.log(rest);
// 7. Sử dụng destructuring để trích xuất các giá trị "name" và "age" từ một mảng chứa các đối tượng "person"
console.log("Kết Quả Bài 7:")
let personArr = [{
    name : "Tuấn",
    age : 19,
    address : "Huế"
}, {
    name : "Tuấn Nhỏ",
    age : 18,
    address : "Đà Nẵng"
}];

let {name,age} = personArr[0]
console.log(name);
console.log(age);
// 8. Sử dụng Rest parameter và Spread operator để tạo một hàm nhận vào danh sách các số và trả về tổng của chúng.
console.log("Kết Quả Bài 8:")
let [...num2] = arr
const sum = (...num2) => {
    let rs = num2.reduce((a,b) => a + b)
    return rs;

}  

console.log(sum(...arr));
// 9. Sử dụng Rest parameter để nhận vào một danh sách tên và trả về chuỗi định dạng "Welcome, [tên1], [tên2], [tên3], ..." cho tất cả các tên.
console.log("Kết Quả Bài 9:")
const string = (...strings) => {
    return "Welcome" + " " + strings;
}
console.log(string("naruto","goku","luffy"));

//10. Tạo một đối tượng "book" với thuộc tính "title", "author" và "pages" bằng cách sử dụng Enhanced object literals. Đối tượng "book" cũng có phương thức "displayInfo" để in ra thông tin về sách.
let book = {
    title : "One Piece",
    author : "Oda",
    pages : 5,
    displayInfo(){
        return "Tiêu Đề:" + this.title + " " + "Tác Giả:" + this.author + " " + "Trang:" + this.pages;
    }

}
console.log("Kết Quả Bài 10:")
console.log(book.displayInfo());









