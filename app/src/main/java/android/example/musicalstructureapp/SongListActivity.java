package android.example.musicalstructureapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {
    public static ArrayList<Track> mSongList;
    public static final String LIST_POSITION = "position";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);
        // Create a list of words
        ArrayList<Track> songTrack = new ArrayList<Track>();
        //add word one
        songTrack.add(new Track(R.drawable.achille_lauro, "Marilù", "Achille Lauro"));
        songTrack.add(new Track(R.drawable.alessandra_amoroso, "Sorriso Grande", "Alessandra Amoroso"));
        songTrack.add(new Track(R.drawable.justin_bieber, "Peaches", "Justin Bieber"));
        songTrack.add(new Track(R.drawable.kali_uchis, "Telepatìa", "Kali Uchis"));
        songTrack.add(new Track(R.drawable.miley_cyrus, "Angels like you", "Miley Cyrus"));
        songTrack.add(new Track(R.drawable.annalisa, "Dieci", "Annalisa"));
        songTrack.add(new Track(R.drawable.atb_topic, "Your Love (9PM)", "ATB X Topic X A7S"));
        songTrack.add(new Track(R.drawable.ava_max, "My head and my heart", "Ava Max"));
        songTrack.add(new Track(R.drawable.bruno_mars, "Leave the door open", "Bruno Mars"));
        songTrack.add(new Track(R.drawable.alvaro_soler, "Magia", "Alvaro Soler"));
        mSongList=songTrack;

        // Create an {@link ArrayAdapter}, whose) data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TrackAdapter adapter =
                new TrackAdapter(this, songTrack);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(),NowPlayingActivity.class);
                intent.putExtra(SongListActivity.LIST_POSITION,position);
                startActivity(intent);;
            }
        });
    }
    }