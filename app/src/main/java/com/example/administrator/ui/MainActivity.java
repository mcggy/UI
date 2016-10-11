package com.example.administrator.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

//    NumberPicker np1,np2;
//    int minPrice =25,maxPrice = 75;

//    ToggleButton toggle;
//    Switch switcher;
    int[] images = new int[]{R.drawable.java, R.drawable.ee, R.drawable.classic, R.drawable.ajax, R.drawable.xml,};
    int currentImg = 0;

//    private int currentColor = 0;
//    final int[] colors = new int[]{
//            R.color.color1,
//            R.color.color2,
//            R.color.color3,
//            R.color.color4,
//            R.color.color5,
//            R.color.color6
//    };
//
//    final int[] names = new int[]{
//            R.id.view01,
//            R.id.view02,
//            R.id.view03,
//            R.id.view04,
//            R.id.view05,
//            R.id.view06
//    };
//    TextView[] views = new TextView[names.length];


//    public static final int NUMBER_PER_SCREEN = 12;
//    public static class DataItem{
//        public String dataName;
//        public Drawable drawable;
//    }
//    private ArrayList<DataItem> items = new ArrayList<DataItem>();
//    private int screenNo = -1;
//    private int screenCount;
//    ViewSwitcher switcher;
//    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.labelicon);
        final ImageView imageView = (ImageView) findViewById(R.id.imageview);
        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 0x1233) {
                    for (int i = 0; i < images.length; i++) {
                        imageView.setImageResource(images[currentImg++ % images.length]);
                    }
                    currentImg++;
                }
                super.handleMessage(msg);
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x1233);
            }
        }, 0, 1200);
    };
//        np1 = (NumberPicker) findViewById(R.id.np1);
//        np2 = (NumberPicker) findViewById(R.id.np2);
//        np1.setMinValue(10);
//        np1.setMaxValue(50);
//        np1.setValue(minPrice);
//        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                minPrice  = newVal;
//                showSelectedPrice();
//            }
//        });
//        np2.setMinValue(60);
//        np2.setMaxValue(100);
//        np2.setValue(maxPrice);
//        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
//            @Override
//            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
//                maxPrice = newVal;
//                showSelectedPrice();
//            }
//        });

//    private void showSelectedPrice(){
//        Toast.makeText(this,"选择的最低价格是："+minPrice+",选择的最高价格是："+maxPrice,Toast.LENGTH_SHORT).show();
//
//    }
//        inflater = LayoutInflater.from(MainActivity.this);
//        for(int i = 0;i < 40;i++){
//            String label = ""+i;
//            Drawable drawable = getResources().getDrawable(R.drawable.ajax);
//            DataItem item = new DataItem();
//            item.dataName = label;
//            item.drawable = drawable;
//            items.add(item);
//        }
//        screenCount = items.size()%NUMBER_PER_SCREEN == 0?items.size()/NUMBER_PER_SCREEN:items.size()/NUMBER_PER_SCREEN+1;
//        switcher = (ViewSwitcher) findViewById(R.id.viewSwitcher);
//        switcher.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                return inflater.inflate(R.layout.slidelistview,null);
//            }
//        });
//        next(null);
//        ListView list1 = (ListView) findViewById(R.id.list1);
//        final BaseAdapter adapter = new BaseAdapter() {
//            @Override
//            public int getCount() {
//                return 40;
//            }
//
//            @Override
//            public Object getItem(int position) {
//                return null;
//            }
//
//            @Override
//            public long getItemId(int position) {
//                return position;
//            }
//
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                LinearLayout line = new LinearLayout(MainActivity.this);
//                line.setOrientation(0);
//                ImageView image = new ImageView(MainActivity.this);
//                TextView text = new TextView(MainActivity.this);
//                text.setText("第"+(position+1)+"个列表项");
//                text.setTextSize(20);
//                text.setTextColor(Color.RED);
//                line.addView(image);
//                line.addView(text);
//                return line;
//            }
//        };
//        list1.setAdapter(adapter);
//        ListView list2 = (ListView) findViewById(R.id.list2);
//        String[] arr2 = {"Java","Hibenate","Android","Spring"};
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
//                (this,R.layout.checked_item,arr2);
//        list2.setAdapter(adapter2);
//        toggle = (ToggleButton) findViewById(R.id.toggle);
//        switcher = (Switch) findViewById(R.id.switcher);
//        final LinearLayout test = (LinearLayout) findViewById(R.id.test);
//        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    test.setOrientation(1);
//                }
//                else{
//                    test.setOrientation(0);
//                }
//            }
//        };
//        toggle.setOnCheckedChangeListener(listener);
//        switcher.setOnCheckedChangeListener(listener);
//        for (int i = 0 ; i<names.length;i++){
//            views[i] = (TextView)findViewById(names[i]);
//        }

//        LinearLayout root = (LinearLayout)findViewById(R.id.root);
//        final DrawView draw = new DrawView(this);
//        draw.setMinimumHeight(500);
//        draw.setMinimumWidth(300);
//        root.addView(draw);
//        LinearLayout main = (LinearLayout)findViewById(R.id.root);
//        final ImageView image = new ImageView(this);
//        main.addView(image);
//        image.setImageResource(images[0]);
//        image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                image.setImageResource(images[++currentImg%images.length]);
//            }
//        });
//        LinearLayout layout = new LinearLayout(this);
//        super.setContentView(layout);
//        layout.setOrientation(LinearLayout.VERTICAL);
//        final TextView show = new TextView(this);
//        Button bn = new Button(this);
//        bn.setText("ok");
//        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        layout.addView(show);
//        layout.addView(bn);
//        bn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                show.setText("Hello , Android ," + new java.util.Date());
//            }
//        });
 //   }

//    public void next(View v){
//        if(screenNo < screenCount-1){
//            screenNo++;
//            switcher.setInAnimation(this, R.anim.slide_in_right);
//            switcher.setOutAnimation(this,R.anim.slide_out_left);
//            ((GridView)switcher.getNextView()).setAdapter(adapter);
//            switcher.showNext();
//        }
//    }
//
//    public void prev(View v){
//        if(screenNo>0){
//            screenNo--;
//            switcher.setInAnimation(this, R.anim.slide_out_left);
//            switcher.setOutAnimation(this, R.anim.slide_in_right);
//            ((GridView)switcher.getNextView()).setAdapter(adapter);
//            switcher.showPrevious();
//        }
//    }
//    private BaseAdapter adapter = new BaseAdapter() {
//        @Override
//        public int getCount() {
//            if(screenNo == screenCount-1 && items.size()%NUMBER_PER_SCREEN!=0){
//                return items.size()%NUMBER_PER_SCREEN;
//            }
//            return NUMBER_PER_SCREEN;
//        }
//
//        @Override
//        public DataItem getItem(int position) {
//            return items.get(screenNo*NUMBER_PER_SCREEN+position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            View view = convertView;
//            if (convertView == null){
//                view = inflater.inflate(R.layout.labelicon,null);
//            }
//            ImageView imageView =(ImageView) view.findViewById(R.id.imageview);
//            imageView.setImageDrawable(getItem(position).drawable);
//            TextView textView = (TextView) view.findViewById(R.id.textview);
//            textView.setText(getItem(position).dataName);
//            return view;
//        }









}
