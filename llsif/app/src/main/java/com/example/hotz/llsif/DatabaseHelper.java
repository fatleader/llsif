package com.example.hotz.llsif;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hotz on 2016-05-11.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // database version
    private static final int DATABASE_VERSION = 1;
    // database name
    public final static String DATABASE_NAME = "songs.db";
    // name of the table.
    public final static String TABLE_NAME = "LLSIF";
    private static final String KEY_ID = "Id";
    public final static String KEY_NAME = "Song Name";
    public final static String KEY_ATTR = "Attribute";
    public final static String KEY_EASY = "Easy";
    public final static String KEY_EASYBLP = "EasyBondLP";
    public final static String KEY_NORM = "Normal";
    public final static String KEY_NORMBLP = "NormalBondLP";
    public final static String KEY_HARD = "Hard";
    public final static String KEY_HARDBLP = "HardBondLP";
    public final static String KEY_EXPT = "Expert";
    public final static String KEY_EXPTBLP = "ExpertBondLP";




    // call this for database!
    public DatabaseHelper(Context context) {
        super (context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

            initialize(db);
    }

    public void initialize ( SQLiteDatabase db){

        // create table!ｚ

        db.execSQL("CREATE TABLE IF NOT EXISTS" + TABLE_NAME + "(Id REAL, Song Name TEXT, Attribute TEXT, Easy REAL, EasyBondLP REAL, Normal REAL, NormalBondLP REAL, Hard REAL, HardBondLP REAL, Expert REAL, ExpertBondLP REAL);");

        // insert values into table

        db.execSQL("INSERT INTO LLSIF VALUES (0,'Natsuiro Egao de 1, 2, Jump!', 'Smile', 12, 2.4, 27, 2.7, 50, 3.33, 94, 3.76);");
        db.execSQL("INSERT INTO LLSIF VALUES (1,'Bokura no LIVE Kimi to no LIFE', 'Smile', 13, 3.25, 25, 4.17, 34, 3.78, 85, 3.4);");
        db.execSQL("INSERT INTO LLSIF VALUES (2,'Yuujou No Change', 'Pure', 13, 2.6, 25, 3.57, 46, 4.6,  90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES (3,'Snow halation', 'Cool', 12, 2.4, 26, 3.25, 46, 3.83, 90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES (4,'baby maybe koi no button', 'Pure', 13,	2.6, 27, 3, 50, 3.57, 92, 3.68);");
        db.execSQL("INSERT INTO LLSIF VALUES (5,'Mermaid Festa Vol.1', 'Cool', 13, 2.6, 32, 3.2, 52, 3.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES (6,'Mogyutto Love de Sekkinchuu!', 'Pure', 13, 2.6, 32, 3.2, 52, 3.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES (7,'Aishiteru Banzai!', 'Smile', 13, 2.6, 33, 3.3, 50, 3.33, 77, 3.08);");
        db.execSQL("INSERT INTO LLSIF VALUES (8,'Wonderful Rush', 'Cool',	24,	4.8, 34, 3.4, 54, 3.6, 96, 3.84);");
        db.execSQL("INSERT INTO LLSIF VALUES(9,'Oh, Love & Peace!', 'Smile', 24, 4.8,	35,	3.5,	59, 3.93, 121, 4.84);");
        db.execSQL("INSERT INTO LLSIF VALUES(10,'Bokura wa Ima no Naka de', 'Smile', 24, 4.8, 34, 3.4, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(11,'WILD STARS', 'Cool', 24, 4.8, 35,	3.5, 65, 4.33, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(12,'Kitto Seishun ga Kikoeru', 'Pure', 24, 4.8, 34,	3.4, 63, 4.2, 129,5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(13,'Kaguya no Shiro de Odoritai', 'Cool',	24, 4.8, 34, 3.4, 65, 4.33, 112, 4.48);");
        db.execSQL("INSERT INTO LLSIF VALUES(14,'Susume→Tomorrow', 'Smile', 24, 4.8, 34, 3.4, 63, 4.2, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(15,'No brand girls', 'Cool', 24, 4.8, 34,	3.4, 77,	5.13, 121, 4.84);");
        db.execSQL("INSERT INTO LLSIF VALUES(16,'Wonder Zone', 'Pure',	24,	4.8, 34, 3.4, 77, 5.13, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(17,'Love Novels', 'Smile', 13, 2.6, 33, 3.3, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(18,'Korekara no Someday',	'Smile', 26, 5.2, 35, 3.5, 79, 5.27, 127, 5.08);");
        db.execSQL("INSERT INTO LLSIF VALUES(19,'Shiranai Love * Oshiete Love', 'Cool', 24, 4.8, 34, 3.4, 61, 4.07, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(20,'START:DASH!!', 'Smile', 26, 5.2, 46, 4.6, 90, 6,	129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(21,'Sweet&Sweet Holiday', 'Pure', 24,	4.8, 27, 2.7, 46, 3.07, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(22,'Ai wa Taiyou Janai?', 'Smile', 23, 4.6, 33, 3.3	,63, 4.2, 96, 3.84);");
        db.execSQL("INSERT INTO LLSIF VALUES(23,'Diamond Princess no Yuuutsu',	'Cool',	13, 2.6, 32, 3.2, 61, 4.07, 110, 4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES(24,'Love marginal', 'Smile', 24, 4.8, 33, 3.3, 65, 4.33, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(25,'Takaramonos',	'Pure', 27, 5.4, 48, 4.8, 96, 6.4, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(26,'Paradise Live', 'Cool', 25, 5, 46, 4.6, 81, 5.4,	139, 5.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(27,'Listen to my heart!!', 'Pure', 26, 5.2, 46, 4.6, 85, 5.67, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(28,'Music S.T.A.R.T!!', 'Smile', 27, 5.4, 48, 4.8, 81, 5.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES(29,'Anone Ganbare!', 'Cool', 26, 5.2, 46, 4.6, 67, 4.47, 114, 4.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(30,'LOVELESS WORLD', 'Cool', 25, 5, 50, 5, 90, 6, 	152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES(31,'after school NAVIGATORS',	'Pure', 27, 5.4, 48,	4.8, 83, 5.53, 129, 5.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(32,'LONELIEST BABY', 'Cool', 27, 5.4, 59, 5.9, 96, 6.4, 141, 5.64);");
        db.execSQL("INSERT INTO LLSIF VALUES(33,'Cutie Panther', 'Smile', 27, 5.4,	46,	4.6, 83,	5.53, 139, 5.56);");
        db.execSQL("INSERT INTO LLSIF VALUES(34,'Sore wa bokutachi no kiseki', 'Smile', 24, 4.8, 46,	4.6, 83, 5.53, 123,	4.92);");
        db.execSQL("INSERT INTO LLSIF VALUES(35,'Pure girls project', 'Pure', 25, 5, 48, 4.8, 89, 5.27, 0 ,0);");
        db.execSQL("INSERT INTO LLSIF VALUES(36,'Donna Toki mo Zutto', 'Pure', 13, 2.6, 34, 3.4, 65, 4.33, 116, 4.64);");
        db.execSQL("INSERT INTO LLSIF VALUES(37,'Binetsu kara Mystery', 'Cool', 27, 5.4, 36, 3.6, 90, 6, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(38,'Yume no Tobira', 'Pure', 27, 5.4, 50, 5, 92, 6.13, 156, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(39,'Natsu, owaranaide.', 'Smile', 10, 2, 26, 2.6, 54, 3.6, 110, 4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES(40,'Love wing bell', 'Smile', 13, 2.6, 33, 3.3, 67, 4.47, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(41,'UNBALANCED LOVE', 'Cool', 26, 5.2, 46, 4.6, 81, 5.4, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(42,'Dancing stars on me!', 'Cool', 23, 4.6, 46, 4.6, 90, 6, 121, 4.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(43,'Kimi no Kuse ni!', 'Pure', 13, 2.6, 27, 2.7, 63, 4.2, 98, 3.9);");
        db.execSQL("INSERT INTO LLSIF VALUES(44,'KiRa-KiRa Sensation!', 'Pure', 24, 4.8, 48, 4.8, 85, 5.66, 139, 5.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(45,'Arifureta Kanashimi no Hate', 'Cool', 11, 2.2, 25, 2.5, 46, 3.07, 90, 3.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(46,'Happy maker!', 'Smile', 24, 4.8, 50, 5, 85, 5.66, 152, 6.1);");
        db.execSQL("INSERT INTO LLSIF VALUES(47,'Kodoku na Heaven', 'Pure', 26, 5.2, 54, 5.4, 98, 6.5, 147, 5.9);");
        db.execSQL("INSERT INTO LLSIF VALUES(48,'Datte Datte Aa Mujou', 'Cool', 23, 4.6, 48,4.8,	98, 6.5, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(49,'Someday of my life', 'Smile',	13,	2.6, 34, 3.4, 79, 5.3, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(50,'COLORFUL VOICE', 'Smile', 27,	5.4, 59, 5.9, 96, 6.4, 154, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(51,'Blueberry♡Train', 'Pure', 13, 2.6, 35, 3.5, 67, 4.5, 110,  4.4);");
        db.execSQL("INSERT INTO LLSIF VALUES(52,'SENTIMENTAL Steps', 'Pure', 11, 2.2, 27, 2.7, 65, 4.3, 94, 3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(53,'Daring!!', 'Cool', 13, 2.6, 35, 3.5, 85, 5.7, 123, 4.9);");
        db.execSQL("INSERT INTO LLSIF VALUES(54,'Mou Hitori Janai yo', 'Smile', 11, 2.2, 26, 2.6, 48, 3.2, 67, 2.7);");
        db.execSQL("INSERT INTO LLSIF VALUES(55,'Yuuki no Reason', 'Cool', 24,	4.8, 52, 5.2, 94, 6.3, 125, 5);");
        db.execSQL("INSERT INTO LLSIF VALUES(56,'Watashitachi wa Mirai no Hana', 'Cool', 27, 5.4, 48, 4.8, 96, 6.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES(57,'Koi no Signal Rin rin rin!', 'Smile', 23, 4.6, 48, 4.8, 96, 6.4, 143, 5.7);");
        db.execSQL("INSERT INTO LLSIF VALUES(58,'Spica Terrible', 'Pure', 23, 4.6,	36,	3.6,	81,	5.4, 147, 5.9);");
        db.execSQL("INSERT INTO LLSIF VALUES(59,'Mahoutsukai Hajimemashita!', 'Smile', 24,	4.8,	36,	3.6, 79, 5.3, 112, 4.5);");
        db.execSQL("INSERT INTO LLSIF VALUES(60,'Jun'ai Lens', 'Pure',	26,	5.2, 48, 4.8, 98, 6.5, 152, 6.1);");
        db.execSQL("INSERT INTO LLSIF VALUES(61,'Angelic Angel', 'Smile', 25, 5, 46, 4.6, 92, 6.1,	156, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(62,'Private Wars', 'Cool', 23, 4.6, 27, 2.7, 59, 3.9, 94,	3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(63,'Futari Happiness', 'Pure', 11, 2.2, 32, 3.2, 63, 4.2, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(64,'SUNNY DAY SONG', 'Pure', 24, 4.8, 50, 5, 98, 6.5,	154, 6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(65,'Trouble Busters', 'Smile', 24, 4.8, 46, 4.6, 98, 6.5, 156,	6.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(66,'Eien Friends', 'Smile', 25, 5, 48, 4.8, 98, 6.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(67,'Aki no Anata no Sora Tooku', 'Pure', 13, 2.6, 35, 3.5, 83, 5.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(68,'Fuyu ga Kureta Yokan', 'Cool', 13, 2.6, 35, 3.5, 79, 5.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(69,'Bokutachi wa Hitotsu no Hikari', 'Smile',	24,	4.8, 46, 4.6, 94, 6.3, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(70,'Nightingale Love Song', 'Cool', 13, 2.6, 27, 2.7, 61, 4.1, 94, 3.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(71,'Shiawase Iki no SMILING!', 'Smile', 13, 2.6, 34, 3.4, 67, 4.5, 114, 4.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(72,'HEART to HEART!', 'Smile', 25, 5, 52,	5.2, 96, 6.4, 158, 6.3);");
        db.execSQL("INSERT INTO LLSIF VALUES(73,'Arashi no Naka no Koi dakara', 'Cool', 13, 2.6, 36, 3.6, 96, 6.4, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(74,'Shocking Party', 'Cool', 11, 2.2,	33,	3.3,	52, 3.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(75,'Mi wa µ'sic no Mi', 'Pure', 23, 4.6, 46, 4.6, 79, 5.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(76,'Super LOVE=Super LIVE!', 'Cool', 25, 5, 54, 5.4, 108, 7.2, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(77,'MOMENT RING',	'Smile', 25, 5,	52, 5.2, 110, 7.3, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(78,'Sayounara e Sayonara!', 'Pure', 13, 2.6, 33, 3.3, 85,	5.7, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(79,'Kimi no Kokoro Wa Kagayaiteru Kai?', 'Pure',	24, 4.8, 46, 4.6, 90, 6, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(80,'Step! ZERO to ONE', 'Cool', 23, 4.6, 48, 4.8, 98, 6.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(81,'Aqours☆HEROES ', 'Smile', 23, 4.6, 46, 4.6, 83, 5.5, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(82,'Moshimo Kara Kitto', 'Pure', 9, 1.8, 23, 2.3, 52,	3.5, 79, 3.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(83,'Suki desu ga Suki desu ka?', 'Pure', 25, 5, 	50,	5, 96, 6.4,	160, 6.4);");
        db.execSQL("INSERT INTO LLSIF VALUES(84,'Zurui yo Magnetic Today', 'Cool',	13,	2.6, 34,	3.4, 94, 6.3, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(85,'Kururin MIRACLE', 'Smile', 13, 2.6, 35, 3.5, 85, 5.7, 139,	5.6);");
        db.execSQL("INSERT INTO LLSIF VALUES(86,'Storm in Lover', 'Cool', 23, 4.6,	34,	3.4, 79,	5.3, 129, 5.2);");
        db.execSQL("INSERT INTO LLSIF VALUES(87,'Puwa Puwa-O!', 'Smile', 13, 2.6, 46, 4.6,	9, 6.4, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(88,'WAO-WAO Powerful day!', 'Smile', 25, 5, 50, 5,	121, 8.1, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(89,'Omoide Ijou ni Naritakute', 'Pure', 11, 2.2, 23, 2.3, 48, 3.2, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(90,'Sakkaku CROSSROADS', 'Cool', 12, 2.4,	32, 3.2, 77,	5.1, 0, 0);");
        db.execSQL("INSERT INTO LLSIF VALUES(91,'Mermaid festa vol.2 ~Passionate~', 'Smile', 32,  6.4, 61, 6.1, 96, 6.4, 158, 6.32);");
        db.execSQL("INSERT INTO LLSIF VALUES(92,'Otomeshiki Renai Juku', 'Pure', 32, 6.4, 54, 5.4, 81, 5.4, 152, 6.08);");
        db.execSQL("INSERT INTO LLSIF VALUES(93,'Soldier Game', 'Cool', 32, 6.4, 54, 5.4, 90, 6, 154, 6.16);");
        db.execSQL("INSERT INTO LLSIF VALUES(94,'Kokuhaku Biyori, desu!', 'Pure', 32, 6.4, 54, 5.4,	90,	6, 156,	6.24);");
        db.execSQL("INSERT INTO LLSIF VALUES(95,'Yume naki Yume wa Yume janai', 'Smile', 46, 9.2, 77, 7.7, 116,	7.73, 172, 6.9);");
        db.execSQL("INSERT INTO LLSIF VALUES(96,'Anemone Heart', 'Cool', 52, 10.4, 92, 9.2, 114, 7.6, 145, 5.8);");
        db.execSQL("INSERT INTO LLSIF VALUES(97,'Nawatobi', 'Pure', 12, 2.4, 33, 3.3, 67, 4.47, 92, 	3.7);");
        db.execSQL("INSERT INTO LLSIF VALUES(98,'Beat in Angel', 'Cool', 46, 9.2, 79, 7.9, 123, 8.2, 160, 6.4);");
        db.execSQL("INSERT INTO LLSIF VALUES(99,'Nico Puri♡Joshidou', 'Smile', 52, 10.4, 81, 8.1, 123, 8.2, 183, 7.3);");
        db.execSQL("INSERT INTO LLSIF VALUES(100,'Garasu no Hanazono', 'Pure', 35, 7, 77, 7.7, 127, 8.46, 170,	6.8);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
        onCreate(db);
    }

    public String getSong(int id){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(llsif, new String [])

        SELECT name, attribute, easy,easybondlp FROM LLSIF WHERE attribute = "Smile" ORDER BY easybondlp DESC;

        return null;
    }
}


