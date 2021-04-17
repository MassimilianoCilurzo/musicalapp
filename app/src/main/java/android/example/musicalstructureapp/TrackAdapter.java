package android.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.example.musicalstructureapp.Track;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TrackAdapter  extends ArrayAdapter {
    public TrackAdapter(Context context, ArrayList<Track> pTrack) {
        super(context,0, pTrack);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Track my_song= (Track) getItem(position);
        ImageView songImageView = listItemView.findViewById(R.id.song_image_view);
        songImageView.setImageResource(my_song.getmImageId());
        TextView songTitleTextView = listItemView.findViewById(R.id.song_title_text_view);
        songTitleTextView.setText(my_song.getSongTitle());
        TextView artistNameTextView =  listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(my_song.getmArtistName());

        return listItemView;
    }



}
