package com.example.practica2_1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @author Jorge Eduardo García Serrano -
 * <a href="mailto:eduardo_garcia@ciencias.unam.mx>eduardo_garcia@ciencias.unam.mx</a>
 * @author Padilla Coronel César -
 * <a href="mailto:c10.0@ciencias.unam.mx>c10.0@ciencias.unam.mx</a>
 */
public class MainActivity extends AppCompatActivity {

    // Comentario de prueba 1.
  
    // Comentario de prueba 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
