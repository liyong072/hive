<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class DropPartitionsResult
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'partitions',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\Partition',
                ),
        ),
    );

    /**
     * @var \metastore\Partition[]
     */
    public $partitions = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['partitions'])) {
                $this->partitions = $vals['partitions'];
            }
        }
    }

    public function getName()
    {
        return 'DropPartitionsResult';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->partitions = array();
                        $_size510 = 0;
                        $_etype513 = 0;
                        $xfer += $input->readListBegin($_etype513, $_size510);
                        for ($_i514 = 0; $_i514 < $_size510; ++$_i514) {
                            $elem515 = null;
                            $elem515 = new \metastore\Partition();
                            $xfer += $elem515->read($input);
                            $this->partitions []= $elem515;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('DropPartitionsResult');
        if ($this->partitions !== null) {
            if (!is_array($this->partitions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('partitions', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->partitions));
            foreach ($this->partitions as $iter516) {
                $xfer += $iter516->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
