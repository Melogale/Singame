package sin.item;

import sin.Game;
import sin.Handler;
import sin.lib.Direction;
import sin.lib.Vector;
import sin.mundus.materia.entity.Bomb;
import sin.mundus.materia.entity.Player;

public class ItemSpecial extends ItemEquipment {

    public ItemSpecial(String name, int maxStack) {
        super(name, maxStack);
    }

    public void onEquip() {

    }

    public void onUse(Game game) {

        Handler handler = game.handler;
        Player p = game.player;
        Direction direction = p.getRoughDirection() == Direction.None ? p.lastDirection : p.getRoughDirection();
        int xs = Vector.xSignumFromDirection(direction);
        int ys = Vector.ySignumFromDirection(direction);

        Bomb proj = new Bomb(p.getXMid() - 8 + xs * 16, p.getYMid() - 8 + ys * 24, game);
        proj.setVelX(xs * 6);
        proj.setVelY(ys * 6);
        handler.addEnt(proj);

    }

}
