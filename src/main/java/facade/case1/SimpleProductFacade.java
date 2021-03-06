package facade.case1;

public class SimpleProductFacade {
    ComplexProduct difficultProduct;

    public SimpleProductFacade() {
        difficultProduct = new ComplexProduct();
    }

    public void setName(String n) {
        char chars[] = n.toCharArray();

        if (chars.length > 0) {
            difficultProduct.setFirstNameCharacter(chars[0]);
        }
        if (chars.length > 1) {
            difficultProduct.setSecondNameCharacter(chars[1]);
        }
        if (chars.length > 2) {
            difficultProduct.setThirdNameCharacter(chars[2]);
        }
        if (chars.length > 3) {
            difficultProduct.setFourthNameCharacter(chars[3]);
        }
        if (chars.length > 4) {
            difficultProduct.setFifthCharacter(chars[4]);
        }
        if (chars.length > 5) {
            difficultProduct.setSixthCharacter(chars[5]);
        }
        if (chars.length > 6) {
            difficultProduct.setSeventhNameCharacter(chars[6]);
        }
        if (chars.length > 7) {
            difficultProduct.setEighthNameCharacter(chars[7]);
        }
        if (chars.length > 8) {
            difficultProduct.setNinthNameCharacter(chars[8]);
        }
        if (chars.length > 9) {
            difficultProduct.setTenthNameCharacter(chars[9]);
        }
        if (chars.length > 10) {
            difficultProduct.setEleventhNameCharacter(chars[10]);
        }
    }

    public String getName() {
        return difficultProduct.getName();
    }

}
