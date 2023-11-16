package com.example.template.repository;

import com.example.template.model.MailBox;

import java.util.List;

public interface IMailBoxRepository {

    public List<String> getLanguageList();
    public List<Integer> getPageSizeList();
    public MailBox getMailBox();

    public void updateMailBox(MailBox mailBox2);
}
