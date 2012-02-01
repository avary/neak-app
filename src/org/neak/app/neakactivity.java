package org.neak.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class neakactivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.neak_titles, R.layout.list_item));
    }
}