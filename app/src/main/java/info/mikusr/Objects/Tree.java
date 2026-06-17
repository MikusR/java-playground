package info.mikusr.Objects;

import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(100, 50, 0);

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt += 10;
        this.trunkDiameterInches++;
    }

    void announceTallTree() {
        if (this.heightFt > 100) System.out.println("Tall");
    }
}
