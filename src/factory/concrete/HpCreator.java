package factory.concrete;

import factory.framework.Item;
import factory.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("DB 에서 체력 회복물약의 정보를 가져옵니다.");

    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약을 생성했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
