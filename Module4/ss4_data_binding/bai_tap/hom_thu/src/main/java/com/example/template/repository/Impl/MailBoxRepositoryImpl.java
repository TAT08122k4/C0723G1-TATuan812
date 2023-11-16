package com.example.template.repository.Impl;

import com.example.template.model.MailBox;
import com.example.template.repository.IMailBoxRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailBoxRepositoryImpl implements IMailBoxRepository {
    private MailBox mailBox = new MailBox("Japanese", 25, true, "Tuan");
    private static List<String> languageList = new ArrayList<>();
    private static List<Integer> pageSizeList = new ArrayList<>();

    static {
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        pageSizeList.add(25);
        pageSizeList.add(30);
        pageSizeList.add(35);
        pageSizeList.add(40);
    }

    public List<String> getLanguageList(){
        return languageList;
    }
    public List<Integer> getPageSizeList(){
        return pageSizeList;
    }
    @Override
    public MailBox getMailBox() {
        return mailBox;
    }

    @Override
    public void updateMailBox(MailBox mailBox2) {
        mailBox = mailBox2;

    }
}
