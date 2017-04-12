-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mer 12 Avril 2017 à 14:07
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanquev2`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `adresse` varchar(25) DEFAULT NULL,
  `codepostal` varchar(25) NOT NULL,
  `ville` varchar(25) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `idclient` int(11) NOT NULL,
  `idconseille` int(11) NOT NULL,
  `idcompte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`nom`, `prenom`, `adresse`, `codepostal`, `ville`, `telephone`, `idclient`, `idconseille`, `idcompte`) VALUES
('tyrael', 'gabriel', 'danstoncul', '10025', 'lyon', '982532', 1, 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE `compte` (
  `solde` int(11) NOT NULL,
  `dateOuverture` date NOT NULL,
  `id_type_compte` int(11) NOT NULL,
  `idcompte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`solde`, `dateOuverture`, `id_type_compte`, `idcompte`) VALUES
(10000, '2012-12-12', 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `conseilleclient`
--

CREATE TABLE `conseilleclient` (
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `adresse` varchar(25) NOT NULL,
  `codepostal` varchar(25) NOT NULL,
  `ville` varchar(25) NOT NULL,
  `telephone` varchar(25) NOT NULL,
  `idconseille` int(11) NOT NULL,
  `login` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `conseilleclient`
--

INSERT INTO `conseilleclient` (`nom`, `prenom`, `adresse`, `codepostal`, `ville`, `telephone`, `idconseille`, `login`, `password`) VALUES
('toto', 'tutu', 'ici', '74000', 'ville', '06547896', 1, 'root', 'toto');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`idclient`),
  ADD KEY `FK_Client_idconseille` (`idconseille`),
  ADD KEY `FK_Client_idcompte` (`idcompte`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`idcompte`);

--
-- Index pour la table `conseilleclient`
--
ALTER TABLE `conseilleclient`
  ADD PRIMARY KEY (`idconseille`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `idclient` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `idcompte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `conseilleclient`
--
ALTER TABLE `conseilleclient`
  MODIFY `idconseille` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `FK_Client_idcompte` FOREIGN KEY (`idcompte`) REFERENCES `compte` (`idcompte`),
  ADD CONSTRAINT `FK_Client_idconseille` FOREIGN KEY (`idconseille`) REFERENCES `conseilleclient` (`idconseille`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
