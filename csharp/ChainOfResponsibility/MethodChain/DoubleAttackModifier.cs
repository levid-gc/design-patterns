using static System.Console;

namespace ChainOfResponsibility.MethodChain
{
    class DoubleAttackModifier : CreatureModifier
    {
        public DoubleAttackModifier(Creature creature) : base(creature)
        {
        }

        public override void Handle()
        {
            WriteLine($"Doubling {creature.Name}'s attack");
            creature.Attack *= 2;
            base.Handle();
        }
    }
}
