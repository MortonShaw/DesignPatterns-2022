package org.example.builder2;

/**
 * @author MortonShaw
 * @date 2021/7/14 19:22
 */
public class Main {

    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain t = builder
                .buildWall()
                .buildFort()
                .buildFort()
                .build();

        Person p = Person.personBuilder()
                .basicInfo(1, "shangsan", 18)
                .score(20)
                .weight(200)
                .location("beijing", "23")
                .build();

    }

}
