package com.example.furi_thailand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String word = getString(R.array.situation_list);


        ListView situationMenu = findViewById(R.id.situation_list);

        List<String> situationList = new ArrayList<>();
        situationList.add("交通・移動/การเคลื่อนไหว");
        situationList.add("ショッピング/ช้อปปิ้ง");
        situationList.add("単語・用語/คำ");
        situationList.add("夜遊び/เล่นกลางคืน");

        ArrayAdapter<String> situationAdaptor = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, situationList);
        situationMenu.setAdapter(situationAdaptor);

        // リストのタップ
        situationMenu.setOnItemClickListener(new ListItemClickListener());
    }


    /*
     * リストをタップした時のメンバクラス
     *
     */
    private class ListItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            // リストのItem
            String item = (String) parent.getItemAtPosition(position);
            String show = item + "はクリックしていますが表示されません";

            // 画面の振り分け
            Intent intent = new Intent();
            intent.putExtra("title", item);
            if (item != "") {
                if (item == "交通・移動/การเคลื่อนไหว") {
                    intent.setClass(MainActivity.this, Situation_accessActivity.class);
                } else if (item == "ショッピング/ช้อปปิ้ง") {
                    intent.setClass(MainActivity.this, Situation_shoppingActivity.class);
                } else if (item == "単語・用語/คำ") {
                    intent.setClass(MainActivity.this, Situation_wordActivity.class);
                } else if (item == "夜遊び/เล่นกลางคืน") {
                    intent.setClass(MainActivity.this, Situation_nightActivity.class);
                }
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
            }


        }
    }

}
