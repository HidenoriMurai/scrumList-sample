package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //インスタンス生成
        List<Scrum> scrumList = List.of(new Scrum("ゴールド", "バックエンド", 11),
                                        new Scrum("ルビー", "バックエンド", 7),
                                        new Scrum("エメラルド", "バックエンド", 8),
                                        new Scrum("サファイア", "フロントエンド", 13),
                                        new Scrum("ダイアモンド", "フロントエンド", 9));

        //チーム名変更処理
        for (Scrum scrum : scrumList) {
            if (scrum.getTeamName().equals("エメラルド")) {
                scrum.setTeamName("シルバー");
                System.out.println("チーム名変更：エメラルドをシルバーに変更しました");
            }
        }
        System.out.println("---------------------------------------------");

        //スクラムリスト一覧を表示する
        System.out.println("スクラムリスト一覧を表示する");
        for (Scrum scrum : scrumList) {
            System.out.println("チーム名：" + scrum.getTeamName() + "  役割：" + scrum.getRole() + "  人数：" + scrum.getNumberOfPeople());
        }
        System.out.println("---------------------------------------------");

        //スクラムリストから10名以上のチームを抽出する
        System.out.println("スクラムリストから10名以上のチームを抽出する");
        for (Scrum scrum : scrumList) {
            if (scrum.getNumberOfPeople() >= 10) {
                System.out.println("10人以上のチームは：" + scrum.getTeamName());
            }
        }
        System.out.println("---------------------------------------------");
    }
}
