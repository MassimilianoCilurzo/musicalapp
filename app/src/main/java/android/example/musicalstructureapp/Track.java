package android.example.musicalstructureapp;
/**
 * {@link Track} represents the information about the song
 * It contains the song name and the artist name
 */
public class Track {


    /**  Name of the Song */
    private int mImageId;

        /**  Name of the Song */
        private String mSongTitle;

        /** Name of the Artist*/
        private String mArtistName;

        /**
         * Create a new Word object.
         * @param imageIdentity  is the id of the image
         * @param songTitle is the name of the song
         * @param artistName is the name of the artist
         */
        public Track(int imageIdentity, String songTitle, String artistName ) {
          mImageId= imageIdentity;
          mSongTitle = songTitle;
          mArtistName = artistName;
        }
    /**
     * Get the the image id
     */
    public int getmImageId() {
        return mImageId;
    }
        /**
         * Get the song name
         */
        public String getSongTitle() {
            return mSongTitle;
        }

        /**
         * Get the artist name
         */
        public String getmArtistName() {
            return mArtistName;
        }


    }
