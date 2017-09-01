package tech.alvarez.friends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import tech.alvarez.friends.adapters.AmigosAdapter;
import tech.alvarez.friends.model.Amigo;

public class MainActivity extends AppCompatActivity {

    private RecyclerView amigosRecyclerView;
    private AmigosAdapter amigosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amigosRecyclerView = (RecyclerView) findViewById(R.id.amigosRecyclerView);
        amigosRecyclerView.setHasFixedSize(true);
        amigosRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        amigosAdapter = new AmigosAdapter(this);

        amigosRecyclerView.setAdapter(amigosAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();

        cargarDatos();
    }

    private void cargarDatos() {
        amigosAdapter.add(new Amigo("https://i.pinimg.com/736x/e8/a9/ce/e8a9ce9ab3f3c5ef298a14514047647e--teddy-bears-teddy-bear-dogs.jpg", "Maria Zandoval", "77241576"));
        amigosAdapter.add(new Amigo("http://www.significado-de-nombres.com/wp-content/uploads/2016/01/perro-pequeno-macho.jpg", "Jose Perez", "77241576"));
        amigosAdapter.add(new Amigo("https://kachorros.club/wp-content/uploads/2017/03/1489763755_480_los-20-perritos-mas-tiernos-y-pequenos-que-jamas-hayas-visto.jpg", "Luciana Alvarez", "77241576"));

        // En lugar de lo anterior, leer esa información de un archivo JSON
    }
}
