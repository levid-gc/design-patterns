using static System.Console;

namespace ChainOfResponsibility.MethodChain
{
    class IncreaseDefenseModifier : CreatureModifier
    {
        public IncreaseDefenseModifier(Creature creature) : base(creature)
        {
        }

        public override void Handle()
        {
            if (creature.Defense <= 2)
            {
                WriteLine($"Increasing {creature.Name}'s dedense");
                creature.Defense++;
            }

            base.Handle();
        }
    }
}
