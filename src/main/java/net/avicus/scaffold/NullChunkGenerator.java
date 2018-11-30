package net.avicus.scaffold;

import java.util.Random;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

@SuppressWarnings("deprecation")
public class NullChunkGenerator extends ChunkGenerator {

  @Override
  public byte[] generate(World world, Random random, int x, int z) {
    return new byte[65536];
  }
}
