package com.example.lesson6.сlient;

import com.example.lesson6.data.GameModel;

import java.util.ArrayList;

public class GameClient {
    public static ArrayList<GameModel> gameList = new ArrayList<>();
    public static ArrayList<GameModel> getGameList(){
        gameList.add(new GameModel("Вопрос 1","2 + 2 = ?","4","3","6","8"));
        gameList.add(new GameModel("Вопрос 2","Кто менеджер в GeekTech?","Кудайберген","Бека","Бека Байке","Алымбек"));
        gameList.add(new GameModel("Вопрос 3","Кто преподаватель в 6 группе ?","Алтынбек байке","Эрлан Байке","Бактияр Байке","Бакыт Байке"));
        gameList.add(new GameModel("Вопрос 4","Самый не понятный учитель ?"," Ни кто ","Алтынбек Байке","Алексей","Алишер"));
        gameList.add(new GameModel("Вопрос 5","8 + 8 = ?","16","15","17","20"));
        gameList.add(new GameModel("Вопрос 6","25 + 25 = ?","50","55","45","60"));
        gameList.add(new GameModel("Вопрос 7","Как правильно пишется ...?","GEEKTECH","GEECKTEC","GEKTECH","GECTEK"));
        gameList.add(new GameModel("Вопрос 8","Правильный ответь?","Кубаныч","Куба","Курманбек","Курбанбек"));
        gameList.add(new GameModel("Вопрос 9","Кто такой Кудайберген?","Он менеджер в GeekTech","Он ученик","учитель","Ни кто"));
        gameList.add(new GameModel("Вопрос щщ10","Кто красивый(ая) в GeekTech?","Это Кубаныч","Это Асема  ","Это Алиаскар","Это Близняшки"));
        return gameList;
    }

}
