package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.List;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener
{
    public static final float DEFAULT_VOLUME = 1.0f;
    public static final int DEFAULT_PRIORITY = 1;
    public static final float DEFAULT_RATE = 1.0f;
    public static final int WHOLE_NOTE = 3000;

    private Button buttonA1;
    private Button buttonB1;
    private Button buttonBB1;
    private Button buttonC1;
    private Button buttonCS1;
    private Button buttonD1;
    private Button buttonDS1;
    private Button buttonE1;
    private Button buttonF1;
    private Button buttonFS1;
    private Button buttonG1;
    private Button buttonGS1;

    private Button buttonA2;
    private Button buttonB2;
    private Button buttonBB2;
    private Button buttonC2;
    private Button buttonCS2;
    private Button buttonD2;
    private Button buttonDS2;
    private Button buttonE2;
    private Button buttonF2;
    private Button buttonFS2;
    private Button buttonG2;
    private Button buttonGS2;

    private Button buttonA3;
    private Button buttonB3;
    private Button buttonBB3;
    private Button buttonC3;
    private Button buttonCS3;
    private Button buttonD3;
    private Button buttonDS3;
    private Button buttonE3;
    private Button buttonF3;
    private Button buttonFS3;
    private Button buttonG3;
    private Button buttonGS3;

    private Button buttonA4;
    private Button buttonB4;
    private Button buttonBB4;
    private Button buttonC4;
    private Button buttonCS4;
    private Button buttonD4;
    private Button buttonDS4;
    private Button buttonE4;
    private Button buttonF4;
    private Button buttonFS4;
    private Button buttonG4;
    private Button buttonGS4;

    private Button buttonA5;
    private Button buttonB5;
    private Button buttonBB5;
    private Button buttonC5;
    private Button buttonCS5;
    private Button buttonD5;
    private Button buttonDS5;
    private Button buttonE5;
    private Button buttonF5;
    private Button buttonFS5;
    private Button buttonG5;
    private Button buttonGS5;

    private Button buttonA6;
    private Button buttonB6;
    private Button buttonBB6;
    private Button buttonC6;


    private Button scale;
    private Button song;

//    private NumberPicker numPickFrequency;
//    private NumberPicker numPickNote;
//    private Button numPickerWork;

    private Map<Integer,Integer> noteMap;

    private SoundPool soundPool;

    private int noteA1;
    private int noteB1;
    private int noteBB1;
    private int noteC1;
    private int noteCS1;
    private int noteD1;
    private int noteDS1;
    private int noteE1;
    private int noteF1;
    private int noteFS1;
    private int noteG1;
    private int noteGS1;

    private int noteA2;
    private int noteB2;
    private int noteBB2;
    private int noteC2;
    private int noteCS2;
    private int noteD2;
    private int noteDS2;
    private int noteE2;
    private int noteF2;
    private int noteFS2;
    private int noteG2;
    private int noteGS2;

    private int noteA3;
    private int noteB3;
    private int noteBB3;
    private int noteC3;
    private int noteCS3;
    private int noteD3;
    private int noteDS3;
    private int noteE3;
    private int noteF3;
    private int noteFS3;
    private int noteG3;
    private int noteGS3;

    private int noteA4;
    private int noteB4;
    private int noteBB4;
    private int noteC4;
    private int noteCS4;
    private int noteD4;
    private int noteDS4;
    private int noteE4;
    private int noteF4;
    private int noteFS4;
    private int noteG4;
    private int noteGS4;

    private int noteA5;
    private int noteB5;
    private int noteBB5;
    private int noteC5;
    private int noteCS5;
    private int noteD5;
    private int noteDS5;
    private int noteE5;
    private int noteF5;
    private int noteFS5;
    private int noteG5;
    private int noteGS5;

    private int noteA6;
    private int noteB6;
    private int noteBB6;
    private int noteC6;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        //initializeNumberPickers();
        initializeSoundPool();
        wireWidgets();
        setListeners();
        initializeNoteMap();
    }

//    private void initializeNumberPickers()
//    {
//        String[] notes = new String[]
//                {
//                   "A1","A2","A3","A4","A5","A6",
//                   "B1","B2","B3","B4","B5","B6",
//                        "BB1","BB2","BB3","BB4","BB5","BB6",
//                   "C1","C2","C3","C4","C5","C6",
//                        "CS1","CS2","CS3","CS4","CS5",
//                   "D1","D2","D3","D4","D5",
//                        "DS1","DS2","DS3","DS4","DS5",
//                   "E1","E2","E3","E4","E5",
//                   "F1","F2","F3","F4","F5",
//                        "FS1","FS2","FS3","FS4","FS5",
//                   "G1","G2","G3","G4","G5",
//                        "GS1","GS2","GS3","GS4","GS5"
//                };
//
//
//        numPickNote.setMaxValue(64);
//        numPickNote.setMinValue(0);
//        numPickNote.setDisplayedValues(notes);
//        numPickFrequency.setMinValue(0);
//        numPickFrequency.setMaxValue(2);
//
//
//
//    }

    private void initializeNoteMap()
    {
        noteMap = new HashMap<>();
        /** in a a map you store a key value pair
         * the key is the button id
         * the value is the note id
         * repeat for all the notes you want
         * **/
        noteMap.put(R.id.button_synth_a1, noteA1);
        noteMap.put(R.id.button_synth_a2, noteA2);
        noteMap.put(R.id.button_synth_a3, noteA3);
        noteMap.put(R.id.button_synth_a4, noteA4);
        noteMap.put(R.id.button_synth_a5, noteA5);
        noteMap.put(R.id.button_synth_a6, noteA6);

        noteMap.put(R.id.button_synth_b1, noteB1);
        noteMap.put(R.id.button_synth_b2, noteB2);
        noteMap.put(R.id.button_synth_b3, noteB3);
        noteMap.put(R.id.button_synth_b4, noteB4);
        noteMap.put(R.id.button_synth_b5, noteB5);
        noteMap.put(R.id.button_synth_b6, noteB6);

        noteMap.put(R.id.button_synth_bb1, noteBB1);
        noteMap.put(R.id.button_synth_bb2, noteBB2);
        noteMap.put(R.id.button_synth_bb3, noteBB3);
        noteMap.put(R.id.button_synth_bb4, noteBB4);
        noteMap.put(R.id.button_synth_bb5, noteBB5);
        noteMap.put(R.id.button_synth_bb6, noteBB6);

        noteMap.put(R.id.button_synth_c1, noteC1);
        noteMap.put(R.id.button_synth_c2, noteC2);
        noteMap.put(R.id.button_synth_c3, noteC3);
        noteMap.put(R.id.button_synth_c4, noteC4);
        noteMap.put(R.id.button_synth_c5, noteC5);
        noteMap.put(R.id.button_synth_c6, noteC6);

        noteMap.put(R.id.button_synth_cs1, noteCS1);
        noteMap.put(R.id.button_synth_cs2, noteCS2);
        noteMap.put(R.id.button_synth_cs3, noteCS3);
        noteMap.put(R.id.button_synth_cs4, noteCS4);
        noteMap.put(R.id.button_synth_cs5, noteCS5);

        noteMap.put(R.id.button_synth_d1, noteD1);
        noteMap.put(R.id.button_synth_d2, noteD2);
        noteMap.put(R.id.button_synth_d3, noteD3);
        noteMap.put(R.id.button_synth_d4, noteD4);
        noteMap.put(R.id.button_synth_d5, noteD5);

        noteMap.put(R.id.button_synth_ds1, noteDS1);
        noteMap.put(R.id.button_synth_ds2, noteDS2);
        noteMap.put(R.id.button_synth_ds3, noteDS3);
        noteMap.put(R.id.button_synth_ds4, noteDS4);
        noteMap.put(R.id.button_synth_ds5, noteDS5);

        noteMap.put(R.id.button_synth_e1, noteE1);
        noteMap.put(R.id.button_synth_e2, noteE2);
        noteMap.put(R.id.button_synth_e3, noteE3);
        noteMap.put(R.id.button_synth_e4, noteE4);
        noteMap.put(R.id.button_synth_e5, noteE5);

        noteMap.put(R.id.button_synth_f1, noteF1);
        noteMap.put(R.id.button_synth_f2, noteF2);
        noteMap.put(R.id.button_synth_f3, noteF3);
        noteMap.put(R.id.button_synth_f4, noteF4);
        noteMap.put(R.id.button_synth_f5, noteF5);

        noteMap.put(R.id.button_synth_fs1, noteFS1);
        noteMap.put(R.id.button_synth_fs2, noteFS2);
        noteMap.put(R.id.button_synth_fs3, noteFS3);
        noteMap.put(R.id.button_synth_fs4, noteFS4);
        noteMap.put(R.id.button_synth_fs5, noteFS5);

        noteMap.put(R.id.button_synth_g1, noteG1);
        noteMap.put(R.id.button_synth_g2, noteG2);
        noteMap.put(R.id.button_synth_g3, noteG3);
        noteMap.put(R.id.button_synth_g4, noteG4);
        noteMap.put(R.id.button_synth_g5, noteG5);

        noteMap.put(R.id.button_synth_gs1, noteGS1);
        noteMap.put(R.id.button_synth_gs2, noteGS2);
        noteMap.put(R.id.button_synth_gs3, noteGS3);
        noteMap.put(R.id.button_synth_gs4, noteGS4);
        noteMap.put(R.id.button_synth_gs5, noteGS5);

    }

    private void initializeSoundPool()
    {
        soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC,0);
        noteA1 = soundPool.load(this, R.raw.n01, 1);
        noteBB1 = soundPool.load(this, R.raw.n02, 1);
        noteB1 = soundPool.load(this, R.raw.n03, 1);
        noteC1 = soundPool.load(this, R.raw.n04, 1);
        noteCS1 = soundPool.load(this, R.raw.n05, 1);
        noteD1 = soundPool.load(this, R.raw.n06, 1);
        noteDS1 = soundPool.load(this, R.raw.n07, 1);
        noteE1 = soundPool.load(this, R.raw.n08, 1);
        noteF1 = soundPool.load(this, R.raw.n09, 1);
        noteFS1 = soundPool.load(this, R.raw.n10, 1);
        noteG1 = soundPool.load(this, R.raw.n11, 1);
        noteGS1 = soundPool.load(this, R.raw.n12, 1);

        noteA2 = soundPool.load(this, R.raw.n13, 1);
        noteBB2 = soundPool.load(this, R.raw.n14, 1);
        noteB2 = soundPool.load(this, R.raw.n15, 1);
        noteC2 = soundPool.load(this, R.raw.n16, 1);
        noteCS2 = soundPool.load(this, R.raw.n17, 1);
        noteD2 = soundPool.load(this, R.raw.n18, 1);
        noteDS2 = soundPool.load(this, R.raw.n19, 1);
        noteE2 = soundPool.load(this, R.raw.n20, 1);
        noteF2 = soundPool.load(this, R.raw.n21, 1);
        noteFS2 = soundPool.load(this, R.raw.n22, 1);
        noteG2 = soundPool.load(this, R.raw.n23, 1);
        noteGS2 = soundPool.load(this, R.raw.n24, 1);

        noteA3 = soundPool.load(this, R.raw.n25, 1);
        noteBB3 = soundPool.load(this, R.raw.n26, 1);
        noteB3 = soundPool.load(this, R.raw.n27, 1);
        noteC3 = soundPool.load(this, R.raw.n28, 1);
        noteCS3 = soundPool.load(this, R.raw.n29, 1);
        noteD3 = soundPool.load(this, R.raw.n30, 1);
        noteDS3 = soundPool.load(this, R.raw.n31, 1);
        noteE3 = soundPool.load(this, R.raw.n32, 1);
        noteF3 = soundPool.load(this, R.raw.n33, 1);
        noteFS3 = soundPool.load(this, R.raw.n34, 1);
        noteG3 = soundPool.load(this, R.raw.n35, 1);
        noteGS3 = soundPool.load(this, R.raw.n36, 1);

        noteA4 = soundPool.load(this, R.raw.n37, 1);
        noteBB4 = soundPool.load(this, R.raw.n38, 1);
        noteB4 = soundPool.load(this, R.raw.n39, 1);
        noteC4 = soundPool.load(this, R.raw.n40, 1);
        noteCS4 = soundPool.load(this, R.raw.n41, 1);
        noteD4 = soundPool.load(this, R.raw.n42, 1);
        noteDS4 = soundPool.load(this, R.raw.n43, 1);
        noteE4 = soundPool.load(this, R.raw.n44, 1);
        noteF4 = soundPool.load(this, R.raw.n45, 1);
        noteFS4 = soundPool.load(this, R.raw.n46, 1);
        noteG4 = soundPool.load(this, R.raw.n47, 1);
        noteGS4 = soundPool.load(this, R.raw.n48, 1);

        noteA5 = soundPool.load(this, R.raw.n49, 1);
        noteBB5 = soundPool.load(this, R.raw.n50, 1);
        noteB5 = soundPool.load(this, R.raw.n51, 1);
        noteC5 = soundPool.load(this, R.raw.n52, 1);
        noteCS5 = soundPool.load(this, R.raw.n53, 1);
        noteD5 = soundPool.load(this, R.raw.n54, 1);
        noteDS5 = soundPool.load(this, R.raw.n55, 1);
        noteE5 = soundPool.load(this, R.raw.n56, 1);
        noteF5 = soundPool.load(this, R.raw.n57, 1);
        noteFS5 = soundPool.load(this, R.raw.n58, 1);
        noteG5 = soundPool.load(this, R.raw.n59, 1);
        noteGS5 = soundPool.load(this, R.raw.n60, 1);

        noteA6 = soundPool.load(this, R.raw.n61, 1);
        noteBB6 = soundPool.load(this, R.raw.n62, 1);
        noteB6 = soundPool.load(this, R.raw.n63, 1);
        noteC6 = soundPool.load(this, R.raw.n64, 1);

    }

    private void wireWidgets()
    {
        buttonA1 = findViewById(R.id.button_synth_a1);
        buttonB1 = findViewById(R.id.button_synth_b1);
        buttonBB1 = findViewById(R.id.button_synth_bb1);
        buttonC1 = findViewById(R.id.button_synth_c1);
        buttonCS1 = findViewById(R.id.button_synth_cs1);
        buttonD1 = findViewById(R.id.button_synth_d1);
        buttonDS1 = findViewById(R.id.button_synth_ds1);
        buttonE1 = findViewById(R.id.button_synth_e1);
        buttonF1 = findViewById(R.id.button_synth_f1);
        buttonFS1 = findViewById(R.id.button_synth_fs1);
        buttonG1 = findViewById(R.id.button_synth_g1);
        buttonGS1 = findViewById(R.id.button_synth_gs1);

        buttonA2 = findViewById(R.id.button_synth_a2);
        buttonB2 = findViewById(R.id.button_synth_b2);
        buttonBB2 = findViewById(R.id.button_synth_bb2);
        buttonC2 = findViewById(R.id.button_synth_c2);
        buttonCS2 = findViewById(R.id.button_synth_cs2);
        buttonD2 = findViewById(R.id.button_synth_d2);
        buttonDS2 = findViewById(R.id.button_synth_ds2);
        buttonE2 = findViewById(R.id.button_synth_e2);
        buttonF2 = findViewById(R.id.button_synth_f2);
        buttonFS2 = findViewById(R.id.button_synth_fs2);
        buttonG2 = findViewById(R.id.button_synth_g2);
        buttonGS2 = findViewById(R.id.button_synth_gs2);

        buttonA3 = findViewById(R.id.button_synth_a3);
        buttonB3 = findViewById(R.id.button_synth_b3);
        buttonBB3 = findViewById(R.id.button_synth_bb3);
        buttonC3 = findViewById(R.id.button_synth_c3);
        buttonCS3 = findViewById(R.id.button_synth_cs3);
        buttonD3 = findViewById(R.id.button_synth_d3);
        buttonDS3 = findViewById(R.id.button_synth_ds3);
        buttonE3 = findViewById(R.id.button_synth_e3);
        buttonF3 = findViewById(R.id.button_synth_f3);
        buttonFS3 = findViewById(R.id.button_synth_fs3);
        buttonG3 = findViewById(R.id.button_synth_g3);
        buttonGS3 = findViewById(R.id.button_synth_gs3);

        buttonA4 = findViewById(R.id.button_synth_a4);
        buttonB4 = findViewById(R.id.button_synth_b4);
        buttonBB4= findViewById(R.id.button_synth_bb4);
        buttonC4 = findViewById(R.id.button_synth_c4);
        buttonCS4 = findViewById(R.id.button_synth_cs4);
        buttonD4 = findViewById(R.id.button_synth_d4);
        buttonDS4 = findViewById(R.id.button_synth_ds4);
        buttonE4 = findViewById(R.id.button_synth_e4);
        buttonF4 = findViewById(R.id.button_synth_f4);
        buttonFS4 = findViewById(R.id.button_synth_fs4);
        buttonG4 = findViewById(R.id.button_synth_g4);
        buttonGS4 = findViewById(R.id.button_synth_gs4);

        buttonA5 = findViewById(R.id.button_synth_a5);
        buttonB5 = findViewById(R.id.button_synth_b5);
        buttonBB5 = findViewById(R.id.button_synth_bb5);
        buttonC5 = findViewById(R.id.button_synth_c5);
        buttonCS5 = findViewById(R.id.button_synth_cs5);
        buttonD5 = findViewById(R.id.button_synth_d5);
        buttonDS5 = findViewById(R.id.button_synth_ds5);
        buttonE5 = findViewById(R.id.button_synth_e5);
        buttonF5 = findViewById(R.id.button_synth_f5);
        buttonFS5 = findViewById(R.id.button_synth_fs5);
        buttonG5 = findViewById(R.id.button_synth_g5);
        buttonGS5 = findViewById(R.id.button_synth_gs5);

        buttonA6 = findViewById(R.id.button_synth_a6);
        buttonB6 = findViewById(R.id.button_synth_b6);
        buttonBB6 = findViewById(R.id.button_synth_bb6);
        buttonC6 = findViewById(R.id.button_synth_c6);


        scale = findViewById(R.id.button_synth_scale);
        song = findViewById(R.id.button_synth_song);

//        numPickFrequency = findViewById(R.id.numberPicker_Synth_Frequency);
//        numPickNote = findViewById(R.id.numberPicker_Synth_Note);
//        numPickerWork = findViewById(R.id.button_Synth_numPick);
    }

    private void setListeners()
    {
        KeyboardNoteListener noteListener = new KeyboardNoteListener();
        buttonA1.setOnClickListener(noteListener);
        buttonB1.setOnClickListener(noteListener);
        buttonBB1.setOnClickListener(noteListener);
        buttonC1.setOnClickListener(noteListener);
        buttonCS1.setOnClickListener(noteListener);
        buttonD1.setOnClickListener(noteListener);
        buttonDS1.setOnClickListener(noteListener);
        buttonE1.setOnClickListener(noteListener);
        buttonF1.setOnClickListener(noteListener);
        buttonFS1.setOnClickListener(noteListener);
        buttonG1.setOnClickListener(noteListener);
        buttonGS1.setOnClickListener(noteListener);

        buttonA2.setOnClickListener(noteListener);
        buttonB2.setOnClickListener(noteListener);
        buttonBB2.setOnClickListener(noteListener);
        buttonC2.setOnClickListener(noteListener);
        buttonCS2.setOnClickListener(noteListener);
        buttonD2.setOnClickListener(noteListener);
        buttonDS2.setOnClickListener(noteListener);
        buttonE2.setOnClickListener(noteListener);
        buttonF2.setOnClickListener(noteListener);
        buttonFS2.setOnClickListener(noteListener);
        buttonG2.setOnClickListener(noteListener);
        buttonGS2.setOnClickListener(noteListener);

        buttonA3.setOnClickListener(noteListener);
        buttonB3.setOnClickListener(noteListener);
        buttonBB3.setOnClickListener(noteListener);
        buttonC3.setOnClickListener(noteListener);
        buttonCS3.setOnClickListener(noteListener);
        buttonD3.setOnClickListener(noteListener);
        buttonDS3.setOnClickListener(noteListener);
        buttonE3.setOnClickListener(noteListener);
        buttonF3.setOnClickListener(noteListener);
        buttonFS3.setOnClickListener(noteListener);
        buttonG3.setOnClickListener(noteListener);
        buttonGS3.setOnClickListener(noteListener);

        buttonA4.setOnClickListener(noteListener);
        buttonB4.setOnClickListener(noteListener);
        buttonBB4.setOnClickListener(noteListener);
        buttonC4.setOnClickListener(noteListener);
        buttonCS4.setOnClickListener(noteListener);
        buttonD4.setOnClickListener(noteListener);
        buttonDS4.setOnClickListener(noteListener);
        buttonE4.setOnClickListener(noteListener);
        buttonF4.setOnClickListener(noteListener);
        buttonFS4.setOnClickListener(noteListener);
        buttonG4.setOnClickListener(noteListener);
        buttonGS4.setOnClickListener(noteListener);

        buttonA5.setOnClickListener(noteListener);
        buttonB5.setOnClickListener(noteListener);
        buttonBB5.setOnClickListener(noteListener);
        buttonC5.setOnClickListener(noteListener);
        buttonCS5.setOnClickListener(noteListener);
        buttonD5.setOnClickListener(noteListener);
        buttonDS5.setOnClickListener(noteListener);
        buttonE5.setOnClickListener(noteListener);
        buttonF5.setOnClickListener(noteListener);
        buttonFS5.setOnClickListener(noteListener);
        buttonG5.setOnClickListener(noteListener);
        buttonGS5.setOnClickListener(noteListener);

        buttonA6.setOnClickListener(noteListener);
        buttonB6.setOnClickListener(noteListener);
        buttonBB6.setOnClickListener(noteListener);
        buttonC6.setOnClickListener(noteListener);


        scale.setOnClickListener(this);
        song.setOnClickListener(this);
    }


    private void delay(int duration)
    {
        try
        {
            Thread.sleep(duration);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    private void playNote(int note, int loop)
    {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY,loop, DEFAULT_RATE);
    }

    private void playNote(Note note, float rate)
    {
        soundPool.play(note.getNoteID(), DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY,0, rate);
    }

    private void playNote(int note)
    {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY,0, DEFAULT_RATE);
    }

    private void playNote(Note note)
    {
        playNote(note.getNoteID(), 0);
    }

    private class KeyboardNoteListener implements View.OnClickListener
    {
        /**
         * make an inner class to handle the button clicks for the individual notes
         * **/
        @Override
        public void onClick(View view)
        {
            /**
             * get the id of the button clicked
             * use the map to figure out what note to play
             * play the note
             * **/
            int id = view.getId();
            int note = noteMap.get(id);
            playNote(note);
        }
    }

    @Override
    public void onClick(View view)
    {
        /** one method to handle the clicks of all the buttons
         * but don't forget to tell the buttons who is doing the listening
         * **/
        switch(view.getId())
        {
            case R.id.button_synth_scale:
                Scale();
                break;
            case R.id.button_synth_song:
                loveYourz();
                break;
        }
    }

    private void loveYourz()
    {
        /**
         * create a new song and the store the song notes buy adding them to the song
         * then at the end play the song
         * **/
        Song loveYourz = new Song();
        loveYourz.add(new Note(noteD4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS3, 0));
        loveYourz.add(new Note(noteC2, 0));
        loveYourz.add(new Note(noteC1, WHOLE_NOTE/2));

        loveYourz.add(new Note(noteD4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS3, 0));
        loveYourz.add(new Note(noteC2, 0));
        loveYourz.add(new Note(noteC1, WHOLE_NOTE/4));

        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS2, 0));
        loveYourz.add(new Note(noteDS1, WHOLE_NOTE/4));


        loveYourz.add(new Note(noteG4, 0));
        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteC4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/2));

        loveYourz.add(new Note(noteG4, 0));
        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteC4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/8));

        loveYourz.add(new Note(noteF4, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/8));

        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/8));

        loveYourz.add(new Note(noteD4, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/8));


        loveYourz.add(new Note(noteD4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS3, 0));
        loveYourz.add(new Note(noteC2, 0));
        loveYourz.add(new Note(noteC1, WHOLE_NOTE/2));

        loveYourz.add(new Note(noteD4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS3, 0));
        loveYourz.add(new Note(noteC2, 0));
        loveYourz.add(new Note(noteC1, WHOLE_NOTE/4));

        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteG3, 0));
        loveYourz.add(new Note(noteDS2, 0));
        loveYourz.add(new Note(noteDS1, WHOLE_NOTE/4));


        loveYourz.add(new Note(noteG4, 0));
        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteC4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/2));

        loveYourz.add(new Note(noteG4, 0));
        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteC4, 0));
        loveYourz.add(new Note(noteBB3, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/4));

        loveYourz.add(new Note(noteDS4, 0));
        loveYourz.add(new Note(noteGS2, 0));
        loveYourz.add(new Note(noteGS1, WHOLE_NOTE/4));
        playSong(loveYourz);
        playSong(loveYourz);
    }

    private void Scale()
    {
        /**
         * play all the notes one at a time with a delay in between the notes
         * **/
        Song scale = new Song();
        scale.add(new Note(noteA1,WHOLE_NOTE/2));
        scale.add(new Note(noteBB1,WHOLE_NOTE/2));
        scale.add(new Note(noteB1,WHOLE_NOTE/2));
        scale.add(new Note(noteC1,WHOLE_NOTE/2));
        scale.add(new Note(noteCS1,WHOLE_NOTE/2));
        scale.add(new Note(noteD1,WHOLE_NOTE/2));
        scale.add(new Note(noteDS1,WHOLE_NOTE/2));
        scale.add(new Note(noteE1,WHOLE_NOTE/2));
        scale.add(new Note(noteF1,WHOLE_NOTE/2));
        scale.add(new Note(noteFS1,WHOLE_NOTE/2));
        scale.add(new Note(noteG1,WHOLE_NOTE/2));
        scale.add(new Note(noteGS1,WHOLE_NOTE/2));


        playSong(scale);
    }

    private void playSong(Song song)
    {
        for (Note note : song.getNotes())
        {
            playNote(note,1.5f);
            delay(note.getDelay());
        }
    }

}