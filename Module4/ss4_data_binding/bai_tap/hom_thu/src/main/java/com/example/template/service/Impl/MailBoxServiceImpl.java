package com.example.template.service.Impl;

import com.example.template.model.MailBox;
import com.example.template.repository.IMailBoxRepository;
import com.example.template.repository.Impl.MailBoxRepositoryImpl;
import com.example.template.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MailBoxServiceImpl implements IMailBoxService {
    @Autowired
    private IMailBoxRepository mailBoxRepository;

    @Override
    public List<String> getLanguageList() {
        return mailBoxRepository.getLanguageList();
    }

    @Override
    public List<Integer> getPageSizeList() {
        return mailBoxRepository.getPageSizeList();
    }

    @Override
    public MailBox getMailBox() {
        return mailBoxRepository.getMailBox();
    }

    @Override
    public void updateMailBox(MailBox mailBox2) {
        mailBoxRepository.updateMailBox(mailBox2);
    }
}
