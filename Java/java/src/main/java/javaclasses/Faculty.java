package javaclasses;

public enum Faculty {
    GENERAL("Лечебный"), PEDIATRIC("Педиатрический"),
    PHARMACEUTICAL("Фармацевтический"), DENTAL("Стоматологический");
    private String realName;

    Faculty(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return realName;
    }
}