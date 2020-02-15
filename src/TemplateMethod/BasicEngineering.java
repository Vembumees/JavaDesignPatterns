package TemplateMethod;

abstract class BasicEngineering {

    public final void completeCourse()
    {
        //the course needs to be completed in the following sequence
        //1.math 2.softskills 3.special paper

        completeMath();
        completeSoftSkills();
        completeSpecialPaper();
    }

    private void completeMath()
    {
        System.out.println("1.Mathematics");
    }

    private void completeSoftSkills()
    {
        System.out.println("2.SoftSkills");
    }

    public abstract void completeSpecialPaper();
}
