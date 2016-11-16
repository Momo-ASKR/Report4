package jp.ac.uryukyu.ie.e165742;

/**
 * Created by e165742 on 2016/11/16.
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public LivingThing(String name, int hitPoint,int attack){


        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     *
     * @return boolean
     */
    public boolean isDead() {
        return dead;
    }
    public String getName() {
        return name;
    }
    public void attack(LivingThing opponent) {
        if(hitPoint>0) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     *
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
        }
    }
}

