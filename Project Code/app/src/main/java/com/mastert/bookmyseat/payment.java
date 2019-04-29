package com.mastert.bookmyseat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class payment extends AppCompatActivity implements View.OnClickListener {
    EditText CCnumber, CCname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        CCname = (EditText)findViewById(R.id.cname);
        CCnumber =  (EditText)findViewById(R.id.ccard);
        findViewById(R.id.paywithbkash).setOnClickListener(this);
        findViewById(R.id.setcard).setOnClickListener(this);
    }
    public void update(){
        CreditCardView creditCardView =(CreditCardView)findViewById(R.id.card1);
        String nam = CCname.getText().toString().trim();
        String pam = CCnumber.getText().toString().trim();
        if (nam.isEmpty()) {
            CCname.setError("Name is required");
            CCname.requestFocus();
            return;
        }
        if (pam.isEmpty()) {
            CCnumber.setError("Card no is required");
            CCnumber.requestFocus();
            return;
        }

        creditCardView.setCardName(nam);
        creditCardView.setCardNumber(pam);;
        creditCardView.setCardBackBackground(R.drawable.cardbackground_world)
        ;

        creditCardView.setType(CardType.VISA);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.paywithbkash:

                startActivity(new Intent(this, bkash.class));
                break;
            case R.id.setcard:
                update();


                break;
        }
    }
}
