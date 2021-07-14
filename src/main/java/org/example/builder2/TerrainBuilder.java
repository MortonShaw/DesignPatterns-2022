package org.example.builder2;

/**
 * @author MortonShaw
 * @date 2021/7/14 19:19
 */
public interface TerrainBuilder {

    TerrainBuilder buildWall();
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();

    Terrain build();

}
