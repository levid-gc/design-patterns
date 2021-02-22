using static System.Console;

namespace ChainOfResponsibility.MethodChain
{
    class NoBonusesModifier : CreatureModifier
    {
        public NoBonusesModifier(Creature creature) : base(creature)
        {
        }

        public override void Handle()
        {
            WriteLine("No bonuses for you!");
            //base.Handle();
        }
    }
}
