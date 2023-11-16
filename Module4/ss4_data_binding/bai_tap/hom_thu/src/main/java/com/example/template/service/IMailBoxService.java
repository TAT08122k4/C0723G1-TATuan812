package com.example.template.service;

import com.example.template.model.MailBox;

import java.util.List;

public interface IMailBoxService {
    public List<String> getLanguageList();
    public List<Integer> getPageSizeList();
    public MailBox getMailBox();

    public void updateMailBox(MailBox mailBox2);
}
