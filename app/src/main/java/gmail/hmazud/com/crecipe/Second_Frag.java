package gmail.hmazud.com.crecipe;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Second_Frag extends android.support.v4.app.Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_second_frag,container,false);

        Button btnAct = (Button) myView.findViewById(R.id.btntoAct2);
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubFrag2.class);
                startActivity(intent);
            }

        });

        Button btnAct1 = (Button) myView.findViewById(R.id.btntoAct2b);
        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubFrag2b.class);
                startActivity(intent);
            }

        });

        Button btnAct2 = (Button) myView.findViewById(R.id.btntoAct2c);
        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubFrag2c.class);
                startActivity(intent);
            }

        });

        Button btnAct3 = (Button) myView.findViewById(R.id.btntoAct2d);
        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubFrag2d.class);
                startActivity(intent);
            }

        });


        Button btnAct4 = (Button) myView.findViewById(R.id.btntoAct2e);
        btnAct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SubFrag2e.class);
                startActivity(intent);
            }

        });
        return myView;

        }
    }