import java.util.ArrayList;
import java.util.List;

public class WalkingRobotII {
    class Robot {
    int w, h, idx;
    boolean moved;
    List<int[]> pos;
    List<Integer> dirs;
    String[] dirNames = {"East", "North", "West", "South"};

    public Robot(int width, int height) {
        w = width; h = height;
        moved = false;
        idx = 0;
        pos = new ArrayList<>();
        dirs = new ArrayList<>();

        for (int i = 0; i < width; i++) { pos.add(new int[]{i, 0}); dirs.add(0); }
        for (int i = 1; i < height; i++) { pos.add(new int[]{width - 1, i}); dirs.add(1); }
        for (int i = width - 2; i >= 0; i--) { pos.add(new int[]{i, height - 1}); dirs.add(2); }
        for (int i = height - 2; i > 0; i--) { pos.add(new int[]{0, i}); dirs.add(3); }
        dirs.set(0, 3);
    }

    public void step(int num) {
        moved = true;
        idx = (idx + num) % pos.size();
    }

    public int[] getPos() { 
        return pos.get(idx); 
    }

    public String getDir() {
        if (!moved) return "East";
        return dirNames[dirs.get(idx)];
    }
}
}
