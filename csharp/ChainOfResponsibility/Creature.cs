namespace ChainOfResponsibility
{
    class Creature
    {
        public string Name;

        public int Attack;

        public int Defense;

        public Creature(string Name, int Attack, int Defense)
        {
            this.Name = Name;
            this.Attack = Attack;
            this.Defense = Defense;
        }
    }
}
