package agribpo.sona.mypopupapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt =(Button)findViewById(R.id.popUpMenuButton);
        // Create an instance of Pop Up menu
        final PopupMenu popup = new PopupMenu(this,bt);

        //inflate the menu resource
        popup.inflate(R.menu.color);

        //Event handling with the Listener event
        // to call the Show() method
        bt.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                popup.show();

            }
        });

        popup.setOnMenuItemClickListener(new
                                                 PopupMenu.OnMenuItemClickListener()
                                                 {
                                                     @Override
                                                     public boolean onMenuItemClick(MenuItem item)
                                                     {
                                                         switch (item.getItemId())
                                                         {
                                                             case R.id.menu_blue:
                                                                 bt.setBackgroundResource
                                                                         (android.R.color.holo_blue_bright);
                                                                 break;
                                                             case R.id.menu_green:
                                                                 bt.setBackgroundResource
                                                                         (android.R.color.holo_green_light);
                                                                 break;
                                                             case R.id.menu_red:
                                                                 bt.setBackgroundResource
                                                                         (android.R.color.holo_orange_dark);
                                                                 break;

                                                         }

                                                         return true;
                                                     }
                                                 });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }
}
