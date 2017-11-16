package com.example.agrendra.tug_icon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent intent = new Intent();
    ListView list;

    String[] itemname = {
            "Color TV Game series",
            "Nintendo Entertainment System",
            "Super Nintendo Entertainment System",
            "Nintendo 64",
            "GameCube",
            "Panasonic Q",
            "Wii",
            "Wii Mini",
            "Wii U",
            "Nintendo Switch"
    };

    Integer[] imgid = {
            R.drawable.nintendo_color_tv_game,
            R.drawable.nintendo_entertainment_system_model,
            R.drawable.super_nintendo_north_america_model,
            R.drawable.nintendo64,
            R.drawable.nintendo_gamecube_purple_model,
            R.drawable.panasonicq,
            R.drawable.the_nintendo_wii,
            R.drawable.wiiminiconsole,
            R.drawable.wii_u_console_and_gamepad,
            R.drawable.nintendo_switch
    };
    /*String[] descriptionitem = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10"
    };*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView)findViewById(R.id.list_data);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void  onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("text1", "Color TV Game series");
                        intent.putExtra("text2", "The Color TV Game series includes five different pieces of hardware, each one with a unique game. Color TV Game systems did not have interchangeable cartridges, so each console could only play a single title. (1977-1979)");
                        intent.putExtra("gambar", R.drawable.nintendo_color_tv_game_large);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("text1", "Nintendo Entertainment System");
                        intent.putExtra("text2", "The Nintendo Entertainment System, an 8-bit system, was one of Nintendo's largest successes. Unlike the Color TV Games, the NES could play different titles that could be purchased at the store. (1985)");
                        intent.putExtra("gambar", R.drawable.nintendo_entertainment_system_model_large);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("text1", "Super Nintendo Entertainment System");
                        intent.putExtra("text2", "The Super Nintendo Entertainment System featured enhanced graphics, a brand new controller, and more. It was the first 16-bit console by Nintendo. (1991)");
                        intent.putExtra("gambar", R.drawable.super_nintendo_north_america_model_large);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("text1", "Nintendo 64");
                        intent.putExtra("text2", "The Nintendo 64 featured greatly improved 3D graphics and a new controller that introduced the modern joystick. It was also the first home console to have four controller ports built into the system. (1996)");
                        intent.putExtra("gambar", R.drawable.nintendo64_large);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("text1", "GameCube");
                        intent.putExtra("text2", "The GameCube featured enhanced graphics and a new controller. The games came on mini-discs. It was the first Nintendo home console to solely use a disc format for games. (2001)");
                        intent.putExtra("gambar", R.drawable.nintendo_gamecube_purple_model_large);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("text1", "Panasonic Q");
                        intent.putExtra("text2", "The Panasonic Q is a hybrid version of the Nintendo GameCube with the ability to play DVDs, Audio CDs, MP3s and CDs as well as several other new features. It was only released in Japan. (2001)");
                        intent.putExtra("gambar", R.drawable.panasonicq_large);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("text1", "Wii");
                        intent.putExtra("text2", "The Wii featured motion controls, a new online system and slightly improved graphics. The graphical change wasn't nearly as dramatic as previous console transitions. The newer black, red, and blue models do not support Gamecube games.(2006)");
                        intent.putExtra("gambar", R.drawable.the_nintendo_wii_large);
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("text1", "Wii Mini");
                        intent.putExtra("text2", "The Wii Mini is a smaller version of the Wii console that lacks most Wii features like internet connectivity and Gamecube backwards capability. It was released in North America, and Europe. (2012)");
                        intent.putExtra("gambar", R.drawable.wiiminiconsole_large);
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("text1", "Wii U");
                        intent.putExtra("text2", "The Wii U features a new controller known as the Wii U GamePad, which has a 6.2\" touch screen built into it. It also boasts new 1080p HD graphics (only on the TV screen). It has a NFC chip used to scan in amiibo (2012)");
                        intent.putExtra("gambar", R.drawable.wii_u_console_and_gamepad_large);
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("text1", "Nintendo Switch");
                        intent.putExtra("text2", "The Nintendo Switch is a new hybrid of home and portable gaming systems. It features a portable console with a screen that can be docked to display on larger displays. It features modular controllers that can attach to the device itself, a grip or in each of the user's hands. (2017)");
                        intent.putExtra("gambar", R.drawable.nintendo_switch_large);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
