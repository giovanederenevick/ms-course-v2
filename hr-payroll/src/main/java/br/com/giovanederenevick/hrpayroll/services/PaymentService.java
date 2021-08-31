package br.com.giovanederenevick.hrpayroll.services;

import br.com.giovanederenevick.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}