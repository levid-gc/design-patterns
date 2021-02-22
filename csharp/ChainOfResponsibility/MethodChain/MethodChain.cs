using static System.Console;

namespace ChainOfResponsibility.MethodChain
{
    class MethodChain
    {
        public static void Run()
        {
            var goblin = new Creature("Goblin", 1, 1);
            WriteLine(goblin);

            var root = new CreatureModifier(goblin);
            root.Add(new DoubleAttackModifier(goblin));
            root.Add(new DoubleAttackModifier(goblin));
            root.Add(new IncreaseDefenseModifier(goblin));

            root.Handle();
            WriteLine(goblin);
        }
    }
}
