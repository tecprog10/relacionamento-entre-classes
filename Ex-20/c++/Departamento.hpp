#ifndef C_DEPARTAMENTO
#define C_DEPARTAMENTO

#include "stdinc.hpp"
class Universidade;

class Departamento
{
private:
  string nome;
  Universidade *universidade;

public:
  Departamento();
  Departamento(const string &nome, Universidade *universidade);
  ~Departamento();
  void setNome(const string &nome);
  const string &getNome() const;
  void setUniversidade(Universidade *universidade);
  const Universidade *getUniversidade() const;
};

#endif