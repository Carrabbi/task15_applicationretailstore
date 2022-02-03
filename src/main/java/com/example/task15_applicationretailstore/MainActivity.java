package com.example.task15_applicationretailstore;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    // Screen elements
    TextView tv;
    CheckBox chb;
    Button btnClr;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;



    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find elements
        tv = (TextView) findViewById(R.id.textView);
        chb = (CheckBox) findViewById(R.id.chbExtMenu);

        img1= (ImageView) findViewById(R.id.image1);
        img2= (ImageView) findViewById(R.id.image2);
        img3= (ImageView) findViewById(R.id.image3);
        img4= (ImageView) findViewById(R.id.image4);
        img5= (ImageView) findViewById(R.id.image5);
        img6= (ImageView) findViewById(R.id.image6);

        btnClr = (Button) findViewById(R.id.btnClr);
        btnClr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // define button handler by id
        switch (v.getId()) {
            case R.id.btnClr:
                // button Cancel
                tv.setText("Witamy ponownie w naszym sklepie  :)");
                img1.setImageResource(0);
                img2.setImageResource(0);
                img3.setImageResource(0);
                img4.setImageResource(0);
                img5.setImageResource(0);
                img6.setImageResource(0);
                break;
        }
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // add menu items
        menu.add(0, 1, 3, "Lego Star Wars");
        menu.add(0, 2, 1, "Lego Architecture");
        menu.add(0, 3, 2, "Lego Brick Headz");
        menu.add(0, 7, 6, "Lego Creator Expert");
        menu.add(1, 4, 4, "Best sellers");
        menu.add(1, 5, 5, "Discounts");
        menu.add(1, 6, 0, "New products");
        return super.onCreateOptionsMenu(menu);
    }



    // refresh menu
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // menu items with group ID = 1 are visible, if CheckBox is selected
        menu.setGroupVisible(1, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }


    // events onClick
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        // Print photos for menu item

        switch (item.getItemId()) {
            case 1:
                // itemid 1 images
                tv.setText("Lego Star Wars");
                img1.setImageResource(R.drawable.lego_sw1);
                img2.setImageResource(R.drawable.lego_sw2);
                img3.setImageResource(R.drawable.lego_sw3new);
                img4.setImageResource(R.drawable.lego_sw4dis);
                img5.setImageResource(R.drawable.lego_sw5best);
                img6.setImageResource(R.drawable.lego_sw6new);
                break;
            case 2:
                // itemid 2 images
                tv.setText("Lego Architecture");
                img1.setImageResource(R.drawable.lego_a1dis);
                img2.setImageResource(R.drawable.lego_a2);
                img3.setImageResource(R.drawable.lego_a3best);
                img4.setImageResource(R.drawable.lego_a4dis);
                img5.setImageResource(R.drawable.lego_a5best);
                img6.setImageResource(R.drawable.lego_a6new);
                break;
            case 3:
                // itemid 3 images
                tv.setText("Lego Brick Headz");
                img1.setImageResource(R.drawable.lego_bh1);
                img2.setImageResource(R.drawable.lego_bh2);
                img3.setImageResource(R.drawable.lego_bh3new);
                img4.setImageResource(R.drawable.lego_bh4dis);
                img5.setImageResource(R.drawable.lego_bh5best);
                img6.setImageResource(R.drawable.lego_bh6new);
                break;
            case 4:
                // itemid 4 images
                tv.setText("Best sellers");
                img1.setImageResource(R.drawable.lego_a3best);
                img2.setImageResource(R.drawable.lego_a5best);
                img3.setImageResource(R.drawable.lego_ce3best);
                img4.setImageResource(R.drawable.lego_ce5best);
                img5.setImageResource(R.drawable.lego_sw5best);
                img6.setImageResource(R.drawable.lego_bh5best);
                break;

            case 5:
                // itemid 5 images
                tv.setText("Discounts");
                img1.setImageResource(R.drawable.lego_ce1dis);
                img2.setImageResource(R.drawable.lego_ce4dis);
                img3.setImageResource(R.drawable.lego_a1dis);
                img4.setImageResource(R.drawable.lego_a4dis);
                img5.setImageResource(R.drawable.lego_sw4dis);
                img6.setImageResource(R.drawable.lego_bh4dis);
                break;
            case 6:
                // itemid 6 images
                tv.setText("New products");
                img1.setImageResource(R.drawable.lego_a6new);
                img2.setImageResource(R.drawable.lego_bh6new);
                img3.setImageResource(R.drawable.lego_bh3new);
                img4.setImageResource(R.drawable.lego_sw3new);
                img5.setImageResource(R.drawable.lego_sw6new);
                img6.setImageResource(R.drawable.lego_ce6new);
                break;

            case 7:
                // itemid 7 images
                tv.setText("Lego Creator Expert");
                img1.setImageResource(R.drawable.lego_ce1dis);
                img2.setImageResource(R.drawable.lego_ce2);
                img3.setImageResource(R.drawable.lego_ce3best);
                img4.setImageResource(R.drawable.lego_ce4dis);
                img5.setImageResource(R.drawable.lego_ce5best);
                img6.setImageResource(R.drawable.lego_ce6new);
                break;

        }



        return super.onOptionsItemSelected(item);
    }
}
