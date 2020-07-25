public enum Corona {

    COVID("COVID"),
    CORONA("CORONA"),
    KORONAVIRUS("KORONAVIRUS"),
    COVID1("COVID-19"),
    COVID2("COVID 19"),
    KORONA("KORONA"),
    VIRUS("VIRUS"),
    PANDEMIYA("PANDEMIYA"),
    KARANTIN("KARANTIN"),
    VAKSINA("VAKSINA"),
    PNEVMONIYA("PNEVMONIYA"),
    КОРОНАВИРУС("КОРОНАВИРУС"),
    CОВИД("CОВИД"),
    КОРОНА("КОРОНА"),
    ВИРУС("ВИРУС"),
    ПАНДЕМИЯ("ПАНДЕМИЯ"),
    КАРАНТИН("КАРАНТИН"),
    ПНЕВМОНИЯ("ПНЕВМОНИЯ"),
    ИНФЕЦИЯ("ИНФЕЦИЯ"),
    TUBERKLOZ("TUBERKLOZ"),
    МАСКА("МАСКА"),
    CD("CD-19");

    private String corona;

    Corona(String corona) {
        this.corona = corona;
    }

    public String getCorona() {
        return this.corona;
    }
}
