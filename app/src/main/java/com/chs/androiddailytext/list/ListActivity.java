package com.chs.androiddailytext.list;

import android.os.Bundle;

import com.chs.androiddailytext.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    private List<ListBean.DataEntity> mList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listview();
        recyclerview();
    }

    private void recyclerview() {
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<TreeListBean> listBeans = new ArrayList<>();
        listBeans.add(new TreeListBean(1,0,1,"item1",null));
        listBeans.add(new TreeListBean(2,0,1,"item2",null));
        listBeans.add(new TreeListBean(3,0,1,"item3",null));
        listBeans.add(new TreeListBean(4,0,1,"item4",null));
        listBeans.add(new TreeListBean(5,0,1,"item5",null));
        listBeans.add(new TreeListBean(6,0,1,"item6",null));
        listBeans.add(new TreeListBean(7,0,1,"item7",null));
        listBeans.add(new TreeListBean(8,0,1,"item8",null));
        listBeans.add(new TreeListBean(9,0,1,"item9",null));
        TreeListAdapter adapter = new TreeListAdapter(listBeans);
        recyclerView.setAdapter(adapter);
    }

    private void listview() {
//        ListView listView = findViewById(R.id.listview);
//        final List<String> data = new ArrayList<>();
//        String json = "{\"total_number\":\"44\",\"number\":44,\"pages\":\"1\",\"page\":\"1\",\"returncode\":\"0\",\"data\":[{\"id\":\"100\",\"place\":\"一号楼\",\"pid\":\"0\",\"ppath\":\"100\",\"level\":\"1\",\"lists\":[{\"id\":\"101\",\"place\":\"1单元\",\"pid\":\"100\",\"ppath\":\"100,101\",\"level\":\"2\",\"lists\":[{\"id\":\"105\",\"place\":\"地下通道\",\"pid\":\"101\",\"ppath\":\"100,101,105\",\"level\":\"3\",\"lists\":[]}]},{\"id\":\"114\",\"place\":\"101\",\"pid\":\"100\",\"ppath\":\"100,114\",\"level\":\"2\",\"lists\":[]},{\"id\":\"115\",\"place\":\"102\",\"pid\":\"100\",\"ppath\":\"100,115\",\"level\":\"2\",\"lists\":[]},{\"id\":\"116\",\"place\":\"201\",\"pid\":\"100\",\"ppath\":\"100,116\",\"level\":\"2\",\"lists\":[]},{\"id\":\"117\",\"place\":\"202\",\"pid\":\"100\",\"ppath\":\"100,117\",\"level\":\"2\",\"lists\":[]},{\"id\":\"132\",\"place\":\"夜夜夜夜\",\"pid\":\"100\",\"ppath\":\"100,132\",\"level\":\"2\",\"lists\":[]},{\"id\":\"133\",\"place\":\"有意义有意义\",\"pid\":\"100\",\"ppath\":\"100,133\",\"level\":\"2\",\"lists\":[{\"id\":\"138\",\"place\":\"哈哈\",\"pid\":\"133\",\"ppath\":\"100,133,138\",\"level\":\"3\",\"lists\":[]}]},{\"id\":\"135\",\"place\":\"101\",\"pid\":\"100\",\"ppath\":\"100,135\",\"level\":\"2\",\"lists\":[]},{\"id\":\"136\",\"place\":\"102\",\"pid\":\"100\",\"ppath\":\"100,136\",\"level\":\"2\",\"lists\":[]},{\"id\":\"141\",\"place\":\"大堂\",\"pid\":\"100\",\"ppath\":\"100,141\",\"level\":\"2\",\"lists\":[]},{\"id\":\"143\",\"place\":\"2单元\",\"pid\":\"100\",\"ppath\":\"100,143\",\"level\":\"2\",\"lists\":[]},{\"id\":\"144\",\"place\":\"3单元\",\"pid\":\"100\",\"ppath\":\"100,144\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"102\",\"place\":\"5号楼\",\"pid\":\"0\",\"ppath\":\"102\",\"level\":\"1\",\"lists\":[{\"id\":\"103\",\"place\":\"602\",\"pid\":\"102\",\"ppath\":\"102,103\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"104\",\"place\":\"F座\",\"pid\":\"0\",\"ppath\":\"104\",\"level\":\"1\",\"lists\":[]},{\"id\":\"106\",\"place\":\"16区\",\"pid\":\"0\",\"ppath\":\"106\",\"level\":\"1\",\"lists\":[{\"id\":\"107\",\"place\":\"大堂\",\"pid\":\"106\",\"ppath\":\"106,107\",\"level\":\"2\",\"lists\":[]},{\"id\":\"108\",\"place\":\"前台办公室\",\"pid\":\"106\",\"ppath\":\"106,108\",\"level\":\"2\",\"lists\":[]},{\"id\":\"109\",\"place\":\"员工通道\",\"pid\":\"106\",\"ppath\":\"106,109\",\"level\":\"2\",\"lists\":[]},{\"id\":\"110\",\"place\":\"东侧卫生间\",\"pid\":\"106\",\"ppath\":\"106,110\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"111\",\"place\":\"二号楼\",\"pid\":\"0\",\"ppath\":\"111\",\"level\":\"1\",\"lists\":[{\"id\":\"118\",\"place\":\"101\",\"pid\":\"111\",\"ppath\":\"111,118\",\"level\":\"2\",\"lists\":[]},{\"id\":\"119\",\"place\":\"102\",\"pid\":\"111\",\"ppath\":\"111,119\",\"level\":\"2\",\"lists\":[]},{\"id\":\"120\",\"place\":\"201\",\"pid\":\"111\",\"ppath\":\"111,120\",\"level\":\"2\",\"lists\":[]},{\"id\":\"121\",\"place\":\"202\",\"pid\":\"111\",\"ppath\":\"111,121\",\"level\":\"2\",\"lists\":[]},{\"id\":\"142\",\"place\":\"大堂\",\"pid\":\"111\",\"ppath\":\"111,142\",\"level\":\"2\",\"lists\":[]},{\"id\":\"145\",\"place\":\"2单元\",\"pid\":\"111\",\"ppath\":\"111,145\",\"level\":\"2\",\"lists\":[]},{\"id\":\"146\",\"place\":\"3单元\",\"pid\":\"111\",\"ppath\":\"111,146\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"112\",\"place\":\"三号楼\",\"pid\":\"0\",\"ppath\":\"112\",\"level\":\"1\",\"lists\":[{\"id\":\"122\",\"place\":\"101\",\"pid\":\"112\",\"ppath\":\"112,122\",\"level\":\"2\",\"lists\":[]},{\"id\":\"123\",\"place\":\"102\",\"pid\":\"112\",\"ppath\":\"112,123\",\"level\":\"2\",\"lists\":[]},{\"id\":\"124\",\"place\":\"201\",\"pid\":\"112\",\"ppath\":\"112,124\",\"level\":\"2\",\"lists\":[]},{\"id\":\"125\",\"place\":\"202\",\"pid\":\"112\",\"ppath\":\"112,125\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"113\",\"place\":\"四号楼\",\"pid\":\"0\",\"ppath\":\"113\",\"level\":\"1\",\"lists\":[{\"id\":\"126\",\"place\":\"101\",\"pid\":\"113\",\"ppath\":\"113,126\",\"level\":\"2\",\"lists\":[]},{\"id\":\"127\",\"place\":\"102\",\"pid\":\"113\",\"ppath\":\"113,127\",\"level\":\"2\",\"lists\":[]},{\"id\":\"128\",\"place\":\"201\",\"pid\":\"113\",\"ppath\":\"113,128\",\"level\":\"2\",\"lists\":[]},{\"id\":\"129\",\"place\":\"202\",\"pid\":\"113\",\"ppath\":\"113,129\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"139\",\"place\":\"15区\",\"pid\":\"0\",\"ppath\":\"139\",\"level\":\"1\",\"lists\":[{\"id\":\"140\",\"place\":\"二层\",\"pid\":\"139\",\"ppath\":\"139,140\",\"level\":\"2\",\"lists\":[]}]},{\"id\":\"147\",\"place\":\"55\",\"pid\":\"0\",\"ppath\":\"147\",\"level\":\"1\",\"lists\":[]}]}";
//
//        final Gson gson = new Gson();
//        ListBean listBean = gson.fromJson(json,ListBean.class);
//
//        mList.addAll(listBean.getData());
//        //为第一级都设置可见
//        for (ListBean.DataEntity bean : mList){
//            bean.setVisible(true);
//        }
//        final ListAdapter adapter = new ListAdapter(this,mList);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ListBean.DataEntity entity = adapter.clicked(position);
//                Log.i("Str-----",entity.getId()+"------"+adapter.getStr());
//            }
//        });
    }

}
