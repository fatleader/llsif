package com.example.hotz.llsif;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hotz on 2016-05-11.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "songs.db";
    public final static String TABLE_NAME = "LLSIF";
    public final static String COL_1 = "song Name";
    public final static String COL_2 = "attribute";
    public final static String COL_3 = "easy";
    public final static String COL_4 = "easyBondLP";
    public final static String COL_5 = "normal";
    public final static String COL_6 = "normalBondLP";
    public final static String COL_7 = "hard";
    public final static String COL_8 = "hardBondLP";
    public final static String COL_9 = "expert";
    public final static String COL_10 = "expertBondLP";




    // call this for database!
    public DatabaseHelper(Context context) {
        super (context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // create table!
        db.execSQL("CREATE TABLE IF NOT EXISTS" + TABLE_NAME + "(Song Name TEXT, Attribute TEXT, Easy REAL, EasyBondLP REAL, Normal REAL, NormalBondLP REAL, Hard REAL, HardBondLP REAL, Expert REAL, ExpertBondLP REAL);");
        // insert values into table
        db.execSQL("INSERT INTO LLSIF VALUES ('Natsuiro Egao de 1, 2, Jump!', 'Smile', 12, 2.4, 27, 2.7, 50, 3.33, 94, 3.76);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Bokura no LIVE Kimi to no LIFE', 'Smile', 13, 3.25, 25, 4.17, 34, 3.78, 85, 3.4);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Yuujou No Change', 'Pure', 13, 2.6, 25, 3.57, 46, 4.6,  90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Snow halation', 'Cool', 12, 2.4, 26, 3.25, 46, 3.83, 90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES ('baby maybe koi no button', 'Pure', 13,	2.6, 27, 3, 50, 3.57, 92, 3.68);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Mermaid Festa Vol.1', 'Cool', 13, 2.6, 32, 3.2, 52, 3.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Mogyutto Love de Sekkinchuu!', 'Pure', 13, 2.6, 32, 3.2, 52, 3.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Aishiteru Banzai!', 'Smile', 13, 2.6, 33, 3.3, 50, 3.33, 77, 3.08);");
        db.execSQL("INSERT INTO LLSIF VALUES ('Wonderful Rush', 'Cool',	24,	4.8, 34, 3.4, 54, 3.6, 96, 3.84);");
        db.execSQL("INSERT INTO LLSIF VALUES('Oh, Love & Peace!', 'Smile', 24, 4.8,	35,	3.5,	59, 3.93, 121, 4.84);");
        db.execSQL("INSERT INTO LLSIF VALUES('Bokura wa Ima no Naka de', 'Smile', 24, 4.8, 34, 3.4, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('WILD STARS', 'Cool', 24, 4.8, 35,	3.5, 65, 4.33, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kitto Seishun ga Kikoeru', 'Pure', 24, 4.8, 34,	3.4, 63, 4.2, 129,5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kaguya no Shiro de Odoritai', 'Cool',	24, 4.8, 34, 3.4, 65, 4.33, 112, 4.48);");
        db.execSQL("INSERT INTO LLSIF VALUES('Susume→Tomorrow', 'Smile', 24, 4.8, 34, 3.4, 63, 4.2, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('No brand girls', 'Cool', 24, 4.8, 34,	3.4, 77,	5.13, 121, 4.84);");
        db.execSQL("INSERT INTO LLSIF VALUES('Wonder Zone', 'Pure',	24,	4.8, 34, 3.4, 77, 5.13, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('Love Novels', 'Smile', 13, 2.6, 33, 3.3, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('Korekara no Someday',	'Smile', 26, 5.2, 35, 3.5, 79, 5.27, 127, 5.08);");
        db.execSQL("INSERT INTO LLSIF VALUES('Shiranai Love * Oshiete Love', 'Cool', 24, 4.8, 34, 3.4, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('START:DASH!!', 'Smile', 26, 5.2, 46, 4.6, 90, 6,	129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('Sweet&Sweet Holiday', 'Pure', 24,	4.8, 27, 2.7, 46, 3.07, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('Ai wa Taiyou Janai?', 'Smile', 23, 4.6, 33, 3.3	,63, 4.2, 96, 3.84);");
        db.execSQL("INSERT INTO LLSIF VALUES('Diamond Princess no Yuuutsu',	'Cool',	13, 2.6, 32, 3.2, 61, 4.07, 110, 4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES('Love marginal', 'Smile', 24, 4.8, 33, 3.3, 65, 4.33, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Takaramonos',	'Pure', 27, 5.4, 48, 4.8, 96, 6.4, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('Paradise Live', 'Cool', 25, 5, 46, 4.6, 81, 5.4,	139, 5.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('Listen to my heart!!', 'Pure', 26, 5.2, 46, 4.6, 85, 5.67, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('Music S.T.A.R.T!!', 'Smile', 27, 5.4, 48, 4.8, 81, 5.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES('Anone Ganbare!', 'Cool', 26, 5.2, 46, 4.6, 67, 4.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('LOVELESS WORLD', 'Cool', 25, 5, 50, 5, 90, 6, 	152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES('after school NAVIGATORS',	'Pure', 27, 5.4, 48,	4.8, 83, 5.53, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('LONELIEST BABY', 'Cool', 27, 5.4, 59, 5.9, 96, 6.4, 141, 5.64);");
        db.execSQL("INSERT INTO LLSIF VALUES('Cutie Panther', 'Smile', 27, 5.4,	46,	4.6, 83,	5.53, 139, 5.56);");
        db.execSQL("INSERT INTO LLSIF VALUES('Sore wa bokutachi no kiseki', 'Smile', 24, 4.8, 46,	4.6, 83, 5.53, 123,	4.92);");
        db.execSQL("INSERT INTO LLSIF VALUES('Pure girls project', 'Pure', 25, 5, 48, 4.8, 89, 5.27, 0 ,0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Donna Toki mo Zutto', 'Pure', 13, 2.6, 34, 3.4, 65, 4.33, 116, 4.64);");
        db.execSQL("INSERT INTO LLSIF VALUES('Binetsu kara Mystery', 'Cool', 27, 5.4, 36, 3.6, 90, 6, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Yume no Tobira', 'Pure', 27, 5.4, 50, 5, 92, 6.13, 156, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Natsu, owaranaide.', 'Smile', 10, 2, 26, 2.6, 54, 3.6, 110, 4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES('Love wing bell', 'Smile', 13, 2.6, 33, 3.3, 67, 4.47, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('UNBALANCED LOVE', 'Cool', 26, 5.2, 46, 4.6, 81, 5.4, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('Dancing stars on me!', 'Cool', 23, 4.6, 46, 4.6, 90, 6, 121, 4.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kimi no Kuse ni!', 'Pure', 13, 2.6, 27, 2.7, 63, 4.2, 98, 3.9);");
        db.execSQL("INSERT INTO LLSIF VALUES('KiRa-KiRa Sensation!', 'Pure', 24, 4.8, 48, 4.8, 85, 5.66, 139, 5.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('Arifureta Kanashimi no Hate', 'Cool', 11, 2.2, 25, 2.5, 46, 3.07, 90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('Happy maker!', 'Smile', 24, 4.8, 50, 5, 85, 5.66, 152, 6.1);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kodoku na Heaven', 'Pure', 26, 5.2, 54, 5.4, 98, 6.5, 147, 5.9);");
        db.execSQL("INSERT INTO LLSIF VALUES('Datte Datte Aa Mujou', 'Cool', 23, 4.6, 48,4.8,	98, 6.5, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Someday of my life', 'Smile',	13,	2.6, 34, 3.4, 79, 5.3, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('COLORFUL VOICE', 'Smile', 27,	5.4, 59, 5.9, 96, 6.4, 154, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Blueberry♡Train', 'Pure', 13, 2.6, 35, 3.5, 67, 4.5, 110,  4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES('SENTIMENTAL Steps', 'Pure', 11, 2.2, 27, 2.7, 65, 4.3, 94, 3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Daring!!', 'Cool', 13, 2.6, 35, 3.5, 85, 5.7, 123, 4.9);");
        db.execSQL("INSERT INTO LLSIF VALUES('Mou Hitori Janai yo', 'Smile', 11, 2.2, 26, 2.6, 48, 3.2, 67, 2.7);");
        db.execSQL("INSERT INTO LLSIF VALUES('Yuuki no Reason', 'Cool', 24,	4.8, 52, 5.2, 94, 6.3, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES('Watashitachi wa Mirai no Hana', 'Cool', 27, 5.4, 48, 4.8, 96, 6.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES('Koi no Signal Rin rin rin!', 'Smile', 23, 4.6, 48, 4.8, 96, 6.4, 143, 5.7);");
        db.execSQL("INSERT INTO LLSIF VALUES('Spica Terrible', 'Pure', 23, 4.6,	36,	3.6,	81,	5.4, 147, 5.9);");
        db.execSQL("INSERT INTO LLSIF VALUES('Mahoutsukai Hajimemashita!', 'Smile', 24,	4.8,	36,	3.6, 79, 5.3, 112, 4.5);");
        db.execSQL("INSERT INTO LLSIF VALUES('Jun'ai Lens', 'Pure',	26,	5.2, 48, 4.8, 98, 6.5, 152, 6.1);");
        db.execSQL("INSERT INTO LLSIF VALUES('Angelic Angel', 'Smile', 25, 5, 46, 4.6, 92, 6.1,	156, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Private Wars', 'Cool', 23, 4.6, 27, 2.7, 59, 3.9, 94,	3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Futari Happiness', 'Pure', 11, 2.2, 32, 3.2, 63, 4.2, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('SUNNY DAY SONG', 'Pure', 24, 4.8, 50, 5, 98, 6.5,	154, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Trouble Busters', 'Smile', 24, 4.8, 46, 4.6, 98, 6.5, 156,	6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Eien Friends', 'Smile', 25, 5, 48, 4.8, 98, 6.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Aki no Anata no Sora Tooku', 'Pure', 13, 2.6, 35, 3.5, 83, 5.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Fuyu ga Kureta Yokan', 'Cool', 13, 2.6, 35, 3.5, 79, 5.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Bokutachi wa Hitotsu no Hikari', 'Smile',	24,	4.8, 46, 4.6, 94, 6.3, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Nightingale Love Song', 'Cool', 13, 2.6, 27, 2.7, 61, 4.1, 94, 3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Shiawase Iki no SMILING!', 'Smile', 13, 2.6, 34, 3.4, 67, 4.5, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('HEART to HEART!', 'Smile', 25, 5, 52,	5.2, 96, 6.4, 158, 6.3);");
        db.execSQL("INSERT INTO LLSIF VALUES('Arashi no Naka no Koi dakara', 'Cool', 13, 2.6, 36, 3.6, 96, 6.4, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Shocking Party', 'Cool', 11, 2.2,	33,	3.3,	52, 3.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Mi wa µ'sic no Mi', 'Pure', 23, 4.6, 46, 4.6, 79, 5.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Super LOVE=Super LIVE!', 'Cool', 25, 5, 54, 5.4, 108, 7.2, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('MOMENT RING',	'Smile', 25, 5,	52, 5.2, 110, 7.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Sayounara e Sayonara!', 'Pure', 13, 2.6, 33, 3.3, 85,	5.7, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kimi no Kokoro Wa Kagayaiteru Kai?', 'Pure',	24, 4.8, 46, 4.6, 90, 6, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Step! ZERO to ONE', 'Cool', 23, 4.6, 48, 4.8, 98, 6.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Aqours☆HEROES ', 'Smile', 23, 4.6, 46, 4.6, 83, 5.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Moshimo Kara Kitto', 'Pure', 9, 1.8, 23, 2.3, 52,	3.5, 79, 3.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Suki desu ga Suki desu ka?', 'Pure', 25, 5, 	50,	5, 96, 6.4,	160, 6.4);");
        db.execSQL("INSERT INTO LLSIF VALUES('Zurui yo Magnetic Today', 'Cool',	13,	2.6, 34,	3.4, 94, 6.3, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kururin MIRACLE', 'Smile', 13, 2.6, 35, 3.5, 85, 5.7, 139,	5.6);");
        db.execSQL("INSERT INTO LLSIF VALUES('Storm in Lover', 'Cool', 23, 4.6,	34,	3.4, 79,	5.3, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES('Puwa Puwa-O!', 'Smile', 13, 2.6, 46, 4.6,	9, 6.4, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('WAO-WAO Powerful day!', 'Smile', 25, 5, 50, 5,	121, 8.1, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Omoide Ijou ni Naritakute', 'Pure', 11, 2.2, 23, 2.3, 48, 3.2, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Sakkaku CROSSROADS', 'Cool', 12, 2.4,	32, 3.2, 77,	5.1, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES('Mermaid festa vol.2 ~Passionate~', 'Smile', 32,  6.4, 61, 6.1, 96, 6.4, 158, 6.32);");
        db.execSQL("INSERT INTO LLSIF VALUES('Otomeshiki Renai Juku', 'Pure', 32, 6.4, 54, 5.4, 81, 5.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES('Soldier Game', 'Cool', 32, 6.4, 54, 5.4, 90, 6, 154, 6.16);");
        db.execSQL("INSERT INTO LLSIF VALUES('Kokuhaku Biyori, desu!', 'Pure', 32, 6.4, 54, 5.4,	90,	6, 156,	6.24);");
        db.execSQL("INSERT INTO LLSIF VALUES('Yume naki Yume wa Yume janai', 'Smile', 46, 9.2, 77, 7.7, 116,	7.73, 172, 6.9);");
        db.execSQL("INSERT INTO LLSIF VALUES('Anemone Heart', 'Cool', 52, 10.4, 92, 9.2, 114, 7.6, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES('Nawatobi', 'Pure', 12, 2.4, 33, 3.3, 67, 4.47, 92, 	3.7);");
        db.execSQL("INSERT INTO LLSIF VALUES('Beat in Angel', 'Cool', 46, 9.2, 79, 7.9, 123, 8.2, 160, 6.4);");
        db.execSQL("INSERT INTO LLSIF VALUES('Nico Puri♡Joshidou', 'Smile', 52, 10.4, 81, 8.1, 123, 8.2, 183, 7.3);");
        db.execSQL("INSERT INTO LLSIF VALUES('Garasu no Hanazono', 'Pure', 35, 7, 77, 7.7, 127, 8.46, 170,	6.8);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
        onCreate(db);
    }
}
