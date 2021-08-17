package factory.framework;

public abstract class ItemCreator {

    public Item create(){

        //아이템 틀
        Item item;

        //정보 요청
        requestItemInfo();
        //아이템 생성
        item = createItem();
        //로그 남기기
        createItemLog();

        //아이템 생성 후 리턴하기
        return item;
    }

    //아이템 생성 전에 DB 에서 아이템 정보 요청
    abstract protected void requestItemInfo();
    //아이템 불법 복제 방지 위해서 로그 생성
    abstract protected void createItemLog();
    //아이템 생성 알고리즘
    abstract protected Item createItem();


}
