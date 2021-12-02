package com.codeberry.myhmiapplication.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

import com.codeberry.myhmiapplication.R;

import java.util.ArrayList;

public class QuantityAdapter extends RecyclerView.Adapter {


    SettingsFragment context;
    ArrayList<String> arrayList;
    QuantityListener quantityListener;



    public QuantityAdapter(SettingsFragment context, ArrayList<String> arrayList, SettingsFragment quantityListener) {
        this.context = context;
        this.arrayList = arrayList;
        this.quantityListener = (QuantityListener) quantityListener;
    }

    @Override
    public int getItemViewType(int position) {
        if (position<3) {
            return 0;
        } else{
            return 1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.row, parent, false);
            return new ViewHolderOne(view);
        } else {
            view = layoutInflater.inflate(R.layout.another_row, parent, false);
            return new ViewHolderTwo(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position<3) {
            ViewHolderOne viewHolderOne=(ViewHolderOne) holder;
            viewHolderOne.checkBox.setText(arrayList.get(position));
        } else {
            ViewHolderTwo viewHolderTwo=(ViewHolderTwo) holder;
            viewHolderTwo.textView.setText(arrayList.get(position));
            viewHolderTwo.textView2.setText("3");
        }

        }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class ViewHolderOne extends RecyclerView.ViewHolder {
        CheckBox checkBox;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkbox);


        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder {
        TextView textView, textView2;
        Button button2, button4;
        int count1 = 3;

        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            button2 = itemView.findViewById(R.id.button2);
            button4 = itemView.findViewById(R.id.button4);

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (count1 == 7) {
                        count1 = 7;
                    } else {
                        count1++;
                        textView2.setText("" + count1);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (count1 == 0) {
                        count1 = 0;
                    } else {
                        count1--;
                    }
                    textView2.setText("" + count1);
                }
            });
        }
    }
}


