-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mvcsimplesjdbc
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mvcsimplesjdbc
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mvcsimplesjdbc` DEFAULT CHARACTER SET utf8 ;
USE `mvcsimplesjdbc` ;

-- -----------------------------------------------------
-- Table `mvcsimplesjdbc`.`marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mvcsimplesjdbc`.`marca` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mvcsimplesjdbc`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mvcsimplesjdbc`.`produto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `preco` DOUBLE NULL,
  `codigoDeBarra` VARCHAR(45) NULL,
  `marca_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_produto_marca_idx` (`marca_codigo` ASC),
  CONSTRAINT `fk_produto_marca`
    FOREIGN KEY (`marca_codigo`)
    REFERENCES `mvcsimplesjdbc`.`marca` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mvcsimplesjdbc`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mvcsimplesjdbc`.`venda` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `dataDaVenda` DATETIME NULL,
  `dataDeVencimento` DATETIME NULL,
  `dataDePagamento` DATETIME NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mvcsimplesjdbc`.`venda_has_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mvcsimplesjdbc`.`venda_has_produto` (
  `venda_codigo` INT NOT NULL,
  `produto_codigo` INT NOT NULL,
  `quantidade` INT NULL,
  `preco` DOUBLE NULL,
  PRIMARY KEY (`venda_codigo`, `produto_codigo`),
  INDEX `fk_venda_has_produto_produto1_idx` (`produto_codigo` ASC),
  INDEX `fk_venda_has_produto_venda1_idx` (`venda_codigo` ASC),
  CONSTRAINT `fk_venda_has_produto_venda1`
    FOREIGN KEY (`venda_codigo`)
    REFERENCES `mvcsimplesjdbc`.`venda` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_has_produto_produto1`
    FOREIGN KEY (`produto_codigo`)
    REFERENCES `mvcsimplesjdbc`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
