package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        //Mapを使用してキーと値を実装する
        System.out.println("各スクラムのSMをキーと値で紐付ける");
        Map<String, String> scrumMaster = new HashMap<>();
        scrumMaster.put("ゴールド", "田中");
        scrumMaster.put("ルビー", "山田");
        scrumMaster.put("シルバー", "佐藤");
        scrumMaster.put("サファイア", "山口");
        scrumMaster.put("ダイアモンド", "武田");

        for (Map.Entry<String, String> scrumMasterData : scrumMaster.entrySet()) {
            if (scrumMasterData.getKey() != null) {
                System.out.println(scrumMasterData.getKey() + "のスクラムマスター：" + scrumMasterData.getValue());
            } else {
                System.out.println("存在しないスクラムチームがあります。");
            }
        }
    }
}
