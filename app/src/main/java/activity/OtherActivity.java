package activity;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.ArrayAdapter;

/**
 * Created by Administrator on 2016/10/12.
 */

public class OtherActivity extends LauncherActivity {
    String[] names = {"设置程序参数","查看星际兵种"};
    Class<?>[] clazzs = {PreferenceActivityTest.class, ExpandableListActivityTest.class};

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
    }

    @Override
    protected Intent intentForPosition(int position) {
        return new Intent(OtherActivity.this,clazzs[position]);
    }
}
