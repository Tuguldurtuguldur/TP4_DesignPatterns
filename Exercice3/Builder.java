package Exercice3;

public abstract class Builder
{
    private String strategy;
    public void startBuilding()
    {
        System.out.println("I build with "+strategy+" material.");
    }

    public void setMaterial(IMaterial material)
    {
        strategy=material.getMaterialName();
    }

}
