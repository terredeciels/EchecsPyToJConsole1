package jv;

import java.util.ArrayList;

public interface FDeplacement {
    ArrayList<Move> pos2(int pos1, String cAd, Board echiquier, boolean dontCallIsAttacked);
}
