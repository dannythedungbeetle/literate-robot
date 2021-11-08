package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.Check;
import com.dan.data.springdataexample.entities.CreditCard;
import com.dan.data.springdataexample.entities.inheritancesuper.SuperBankCheck;
import com.dan.data.springdataexample.entities.inheritancesuper.SuperCard;
import com.dan.data.springdataexample.repository.PaymentRepository;
import com.dan.data.springdataexample.repository.SuperPaymentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentTests {
    @Autowired
    PaymentRepository repository;

    @Autowired
    SuperPaymentRepo superPaymentRepo;

    @Test
    public void contextLoads() {

    }

    @Test
    void createCCPayment() {
        CreditCard cc = new CreditCard();
        cc.setCardnumber("123456789");
        cc.setAmount(10000);
        cc.setId(11);
        repository.save(cc);
    }

    @Test
    void createCheckPayment() {
        Check check = new Check();
        check.setChecknumber("09389899834");
        check.setId(22);
        check.setAmount(999);
        repository.save(check);
    }


    @Test
    void createSuperCCPayment() {
        SuperCard cc = new SuperCard();
        cc.setCardnumber("123456789");
        cc.setAmount(10000);
        cc.setId(11);
        superPaymentRepo.save(cc);
    }

    @Test
    void createSuperBankCheckPayment() {
        SuperBankCheck check = new SuperBankCheck();
        check.setChecknumber("09389899834");
        check.setId(22);
        check.setAmount(999);
        superPaymentRepo.save(check);
    }
}
