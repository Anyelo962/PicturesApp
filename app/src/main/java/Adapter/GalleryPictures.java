package Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.core.content.res.ResourcesCompat;

import com.example.picturesapp.R;

public class GalleryPictures extends BaseAdapter {

    private Context mContext;


    public int[] imageArray = {
            R.drawable.blue,
            R.drawable.blueperla,
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food4,
            R.drawable.food5,
            R.drawable.perla

    };

    public GalleryPictures(Context context ){
        this.mContext = context;

    }
    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView((mContext));
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        340
                        ,350
                ));
        return imageView;
    }
}
