package sg.edu.rp.c346.id20028636.l07_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.textView);
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3,"durian");
        String text = "Fruits\n";
        text += "================\n";
        for (int i=0; i<fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);

        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1,"dragon fruit");
    }

}